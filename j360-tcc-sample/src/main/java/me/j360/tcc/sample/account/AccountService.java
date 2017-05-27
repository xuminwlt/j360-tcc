package me.j360.tcc.sample.account;

import me.j360.tcc.core.ActionType;
import me.j360.tcc.core.CompensableBusinessAction;

import java.math.BigDecimal;

/**
 * Package: me.j360.tcc.sample.account
 * User: min_xu
 * Date: 2017/5/27 下午1:55
 * 说明：
 */
public interface AccountService {

    @CompensableBusinessAction(name = "账户" ,commitMethod = "doCommit", rollbackMethod = "doRollback" ,actionType = ActionType.REMOTE)
    void doPrepare(Long uid, BigDecimal amount);

    void doCommit(Long uid, BigDecimal amount);

    void doRollback(Long uid, BigDecimal amount);
}
