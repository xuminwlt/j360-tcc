package me.j360.tcc.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Package: me.j360.tcc.core
 * User: min_xu
 * Date: 2017/5/27 下午2:53
 * 说明：协作管理类,面向底层实现
 */
public class CoordinatorManager {


    /**
     * 服务端的注册列表,具体的执行由rpc完成,这里作为客户端的调用列表,Object => proxy
     * 用于和rpc/spring的解耦,不同的rpc,Object存放不同的Bean
     */

    private Map<String, Object> handlerMap = new HashMap<String, Object>();


    public <T> T getBean(Class<T> var1) {
        return (T) this.handlerMap.get(var1.getCanonicalName());
    }


    /**
     * 执行对应的confirm、rollback方法,执行本地的handlerMap中的Object,可选反射/Proxy、异步等方式二次包装
     */
    public Object invoke(TransactionContext transactionContext) {
        return null;
    }
















    private Object invokeProxyAsync() {
        return null;
    }

    private Object invokeProxy() {
        return null;
    }


    private Object invokeMethod(Object object,String methodName,Class[] types,Object args[]) {
        Method method = null;

        try {
            method = object.getClass().getMethod(methodName, types);
            return method.invoke(object, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
