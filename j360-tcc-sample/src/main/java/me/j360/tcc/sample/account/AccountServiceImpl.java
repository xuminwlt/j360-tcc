package me.j360.tcc.sample.account;

import me.j360.tcc.core.ActionType;
import me.j360.tcc.core.CompensableBusinessAction;

/**
 * Package: me.j360.tcc.sample.account
 * User: min_xu
 * Date: 2017/5/27 下午1:56
 * 说明：
 */
public class AccountServiceImpl {


    @CompensableBusinessAction(name = "账户" ,commitMethod = "doCommit", rollbackMethod = "doRollback" ,actionType = ActionType.REMOTE)
    public void doPrepare() {

    }
}
