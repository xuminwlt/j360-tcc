package me.j360.tcc.core;

/**
 * Package: me.j360.tcc.core
 * User: min_xu
 * Date: 2017/5/27 下午2:15
 * 说明：
 */

public class TransactionContext {

    private Long gtid;
    private Long tid;
    private Long pid;
    private String name;
    private int state;

    private String className;
    private String commitMethod;

    private Class[] parameterTypes;
    private Object[] args;
}
