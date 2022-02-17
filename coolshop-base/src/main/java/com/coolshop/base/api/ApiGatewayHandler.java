package com.coolshop.base.api;

import com.coolshop.base.constant.APIConstants;
import com.coolshop.base.tool.DateTools;
import com.coolshop.base.tool.JSONTools;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;

public class ApiGatewayHandler implements InitializingBean,ApplicationContextAware{
    private Logger logger = LoggerFactory.getLogger("ApiGatewayHandler");
    ApiStore store;
    ParameterNameDiscoverer discoverer;



    public ApiGatewayHandler() {
        discoverer = new LocalVariableTableParameterNameDiscoverer();
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        store = new ApiStore(context);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        store.loadAPIFromSpringBean();
    }

    public Object handle(HttpServletRequest request, HttpServletResponse response) {
        // 系统参数验证
        String params = request.getParameter(APIConstants.PARAMS);
        String method = request.getParameter(APIConstants.METHOD);
        Object result = null;
        ApiStore.ApiRunnable apiRunner = null;
        try {
            apiRunner = validateSystemParams(request);
            logger.info("请求接口={"+method+"},参数列表="+params);
            Object[] args = buildParams(apiRunner,params,request);
            apiRunner.run(args);
        } catch (ApiException e) {
            response.setStatus(500);
            logger.error("调用接口={"+method+"}异常,参数列表=\"+params",e);
            result = handleError(e);
        } catch (InvocationTargetException e) {
            response.setStatus(500);
            logger.error("请求接口={"+method+"},参数列表=\"+params",e.getTargetException());
            result = handleError(e);
        } catch (Exception e) {
            response.setStatus(500);
            logger.error("其他异常:",e);
            result = handleError(e);
        }

        return result;
    }

    // 异常处理
    private Object handleError(Throwable t) {
        String code = null;
        if (t instanceof ApiException) {
            code = "1";
        } else {
            code = "2";
        }
        Map<String,Object> result = new HashMap<>();
        result.put("errorCode",code);
        result.put("msg",t.getMessage());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);
        t.printStackTrace(ps);
        return result;
    }

    // 验证业务参数，和构建业务参数对象
    private Object[] buildParams(ApiStore.ApiRunnable apiRunner, String paramJson, HttpServletRequest request) throws ApiException {
        Map<String,Object> paramMap = null;
        try {
            paramMap = JSONTools.toMap(paramJson);
        } catch (Exception e) {
            throw new ApiException( "调用失败：json字符串格式异常，请检查params参数");
        }
        if (paramMap == null) {
            paramMap = new HashMap<>();
        }
        Method method = apiRunner.targetMethod; // 目标方法
        // 获取该方法参数名称
        List<String> paramNames = Arrays.asList(discoverer.getParameterNames(method));
        // 获取方法参数类型
        Class<?>[] paramTypes = method.getParameterTypes();
        for (Map.Entry<String,Object> entry : paramMap.entrySet()) {
            if (!paramNames.contains(entry.getKey())) {
                throw new ApiException( "调用失败：接口不存在‘" + entry.getKey() + "’参数");
            }
        }
        Object[] args = new Object[paramTypes.length];
        for (int i = 0; i < paramTypes.length; i++) {
            if (paramTypes[i].isAssignableFrom(HttpServletRequest.class)) {
                args[i] = request;
            } else if (paramMap.containsKey(paramNames.get(i))) {
                try {
                    args[i] = convert(paramMap.get(paramNames.get(i)), paramTypes[i]);
                } catch (Exception e) {
                    throw new ApiException( "调用失败：指定参数格式错误或值错误‘" + paramNames.get(i) + "’" + e.getMessage());
                }
            } else {
                args[i] = null;
            }
        }
        return args;
    }

    // 校验系统参数
    private ApiStore.ApiRunnable validateSystemParams(HttpServletRequest request) throws ApiException {
        String json = request.getParameter(APIConstants.PARAMS);
        String apiName = request.getParameter(APIConstants.METHOD);
        sign(request);
        ApiStore.ApiRunnable apiRunner = null;
        if (StringUtils.isBlank(apiName)) {
            throw new ApiException("调用失败: 参数method为空");
        } else if (StringUtils.isBlank(json)) {
            throw new ApiException("调用失败: 参数params为空");
        } else if ((apiRunner = store.findApiRunnable(apiName)) == null) {
            throw new ApiException("调用失败: 指定API不存在,API: "+apiName);
        }
        return apiRunner;
    }


    private void sign(HttpServletRequest request) throws ApiException {
        String params = request.getParameter(APIConstants.PARAMS);
        String method = request.getParameter(APIConstants.METHOD);
        String token = request.getParameter(APIConstants.TOKEN);
        String sign = request.getParameter(APIConstants.SIGN);
        String timestamp = request.getParameter(APIConstants.TIMESTAMP);
        if (LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8")) - 10 * 60 * 1000 > Long.parseLong(timestamp)) {
            throw new ApiException( "调用失败: 请求已过期");
        }
        // 签名认证
    }

    private static Object convert(Object src, Class dest) {
        if (src == null) return null;
        if (Integer.class == dest) {
            return Integer.parseInt(src.toString());
        } else if (Long.class == dest) {
            return Long.parseLong(src.toString());
        } else if (Float.class == dest) {
            return Float.parseFloat(src.toString());
        } else if (Double.class == dest) {
            return Double.parseDouble(src.toString());
        } else if (LocalDateTime.class == dest) {
            return DateTools.toLocalDateTime(src.toString());
        } else if (Date.class == dest) {
            return DateTools.toDate(src.toString());
        } else if (String.class == dest) {
            return src.toString();
        } else {

        }
        return null;
    }
    class ApiException extends Throwable {
        public ApiException() {
        }

        public ApiException(String message) {
            super(message);
        }

        public ApiException(String message, Throwable cause) {
            super(message, cause);
        }

        public ApiException(Throwable cause) {
            super(cause);
        }

        public ApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
}
