package me.j360.tcc.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Package: me.j360.tcc.core
 * User: min_xu
 * Date: 2017/5/27 下午2:53
 * 说明：协作管理类,面向底层实现
 */
public class CoordinatorManager {


    //服务端的注册列表,具体的执行由rpc完成
    private Map<String, Object> handlerMap = new HashMap<String, Object>();



    public <T> T getBean(Class<T> var1) {
        return (T) this.handlerMap.get(var1.getCanonicalName());
    }


    //执行对应的confirm、rollback方法
    public Object invoke(TransactionContext transactionContext) {
        return null;
    }



}
