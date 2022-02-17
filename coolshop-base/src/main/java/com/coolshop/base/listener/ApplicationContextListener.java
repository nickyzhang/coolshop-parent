package com.coolshop.base.listener;


public class ApplicationContextListener{}
// spring容器初始化完成事件
//@Component
//public class ApplicationContextListener implements ApplicationListener<ContextRefreshedEvent> {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationContextListener.class);
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
////        if(null == contextRefreshedEvent.getApplicationContext().getParent()) {
////            LOGGER.debug(">>>>> spring初始化完毕 <<<<<");
////            // spring初始化完毕后，通过反射调用所有使用BaseService注解的initDao方法
////            Map<String, Object> baseServices = contextRefreshedEvent.getApplicationContext().getBeansWithAnnotation(BaseService.class);
////            for (Object service : baseServices.values()) {
////                LOGGER.debug(">>>>> {}.initDao()", service.getClass().getName());
////                try {
////                    Method initDao = service.getClass().getMethod("initDao");
////                    initDao.invoke(service);
////                } catch (Throwable e) {
////                    LOGGER.error("初始化BaseService的initDao方法异常", e);
////                    e.printStackTrace();
////                }
////            }
////        }
//    }
//}
