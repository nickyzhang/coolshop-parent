package com.coolshop.base.api;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class ApiStore {
    private ApplicationContext context;
    private HashMap<String,ApiRunnable> apiMap = new HashMap<String, ApiRunnable>();

    public ApiStore(ApplicationContext context) {
        Assert.notNull(context);
        this.context = context;
        loadAPIFromSpringBean();
    }

    /**  对标记的API方法进行绑定 */
    public void loadAPIFromSpringBean() {
        // 从spring 容器中获取所有bean的名字
        String[] names = context.getBeanDefinitionNames();
        Class<?> clazz;
        // 遍历容器所有bean的全限定名称
        for (String name : names) {
            // 根据bean的名字获取bean的class类型
            clazz = context.getType(name);
            // 根据class获取这个类上声明的方法
            for (Method method : clazz.getDeclaredMethods()) {
                // 获取方法上的注解
                ApiMapping apiMapping = method.getAnnotation(ApiMapping.class);
                if (apiMapping != null) {
                    addApiItem(apiMapping,name,method);
                }
            }
        }
    }

    // 根据API的名字查找具体的ApiRunnable
    public ApiRunnable findApiRunnable(String apiName) {

        return apiMap.get(apiName);
    }

    // 添加到内存中
    private void addApiItem(ApiMapping apiMapping, String beanName, Method method) {
        ApiRunnable apiRun = new ApiRunnable();
        apiRun.apiName = apiMapping.value();
        apiRun.targetName = beanName;
        apiRun.targetMethod = method;
        apiMap.put(apiMapping.value(),apiRun);
    }

    // 根据接口名字和版本找到某版本的网关
    public ApiRunnable findApiRunnable(String apiName, String version) {

        return (ApiRunnable)apiMap.get(apiName+"_"+version);
    }

    // 找到所有这个
    public List<ApiRunnable> findApiRunnables(String apiName) {
        if (StringUtils.isBlank(apiName)) {
            throw new IllegalArgumentException("Api name must not null！");
        }

        List<ApiRunnable> apiRunnableList = new ArrayList<>();
        for (ApiRunnable apiRun : apiMap.values()) {
            if (apiRun.apiName.equals(apiName)) {
                apiRunnableList.add(apiRun);
            }
        }
        return apiRunnableList;
    }

    public List<ApiRunnable> getAll() {
        List<ApiRunnable> apiRunnableList = new ArrayList<>(20);
        apiRunnableList.addAll(apiMap.values());
        Collections.sort(apiRunnableList, new Comparator<ApiRunnable>() {
            @Override
            public int compare(ApiRunnable o1, ApiRunnable o2) {
                return o1.apiName.compareTo(o2.apiName);
            }
        });
        return apiRunnableList;
    }

    class ApiRunnable{
        String apiName; // 接口方法标志，或者接口名称
        String targetName; // Spring容器中bean的名字
        Object target; // 注解所添加方法的目标所在类
        Method targetMethod; // 注解所添加到的目标方法
        public Object run(Object... args) throws InvocationTargetException,
                IllegalAccessException {
            if (target == null) {
                target = context.getBean(targetName);
            }
            return targetMethod.invoke(target,args);
        }

        public Class<?>[] getParamTypes() {

            return targetMethod.getParameterTypes();
        }

        public Object getTarget() {
            if (target==null){
                target = context.getBean(targetName);
            }
            return target;
        }

    }
}
