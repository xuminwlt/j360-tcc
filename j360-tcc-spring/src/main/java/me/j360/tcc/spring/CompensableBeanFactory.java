package me.j360.tcc.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Package: me.j360.tcc.spring
 * User: min_xu
 * Date: 2017/6/1 下午1:35
 * 说明：
 */
public class CompensableBeanFactory implements ApplicationContextAware {

    private final Map<String, Object> beanDefinitionMap = new ConcurrentHashMap<String, Object>(64);

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //将补偿的bean写入到CoordinatorManager


    }



}
