package me.j360.tcc.core;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Package: me.j360.tcc.core
 * User: min_xu
 * Date: 2017/5/27 下午2:17
 * 说明：
 */
public class ComponsableTranactionHolder {


    private static final ThreadLocal<Deque<TransactionContext>> transactions = new ThreadLocal<>();

    public static TransactionContext getCurrentTransactionContext() {
        return transactions.get().getFirst();
    }

    public static void put(TransactionContext transactionContext) {
        Deque<TransactionContext> deque = new ArrayDeque<TransactionContext>();
        deque.add(transactionContext);
        transactions.set(deque);
    }
}
