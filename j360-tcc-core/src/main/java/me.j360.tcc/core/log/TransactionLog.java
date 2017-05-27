package me.j360.tcc.core.log;

/**
 * Package: me.j360.tcc.core.log
 * User: min_xu
 * Date: 2017/5/27 下午2:21
 * 说明：
 */

public class TransactionLog {

    private Long gtid;
    private Long tid;
    private Long pid;
    private String name;
    private int state;


    private String className;
    private String commitMethod;
    private String rollbackMethod;
    private String actionType;
}
