package me.j360.tcc.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Package: me.j360.tcc.core
 * User: min_xu
 * Date: 2017/5/27 下午1:46
 * 说明：补偿型事务注解器
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface CompensableBusinessAction {

    String name() default "";

    String commitMethod() default "";

    String rollbackMethod() default "";

    ActionType actionType() default ActionType.REMOTE;
}
