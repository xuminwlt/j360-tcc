package me.j360.tcc.core;

import me.j360.tcc.core.log.TransactionRepository;

/**
 * Package: me.j360.tcc.core
 * User: min_xu
 * Date: 2017/5/27 下午2:16
 * 说明：事务管理类,面向业务
 */
public class CompensableTransactionManager {

    private volatile static CompensableTransactionManager compensableTransactionManager;

    private TransactionRepository transactionRepository;

    private CompensableTransactionManager() {

    }

    public CompensableTransactionManager getInstance() {
        if (null == compensableTransactionManager) {
            synchronized (compensableTransactionManager) {
                if (null == compensableTransactionManager) {
                    return new CompensableTransactionManager();
                }
            }
        }
        return compensableTransactionManager;
    }


    public void begin() {

    }


    public void commit() {

    }


    public void rollback() {

    }

}
