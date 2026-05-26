package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class AccountReceivableBean extends DefaultSession {
    private final AccountReceivableEJBDAO accountReceivableEJBDAO = new AccountReceivableEJBDAO();
    public HashMap insertAccountReceivable(DefaultParameters param) throws DefaultEJBException {
        return accountReceivableEJBDAO.insertAccountReceivable(param);
    }
    public Collection selectAccountReceivableList(DefaultParameters param) throws DefaultEJBException {
        return accountReceivableEJBDAO.selectAccountReceivableList(param);
    }
    public HashMap selectAccountReceivableDetail(DefaultParameters param) throws DefaultEJBException {
        return accountReceivableEJBDAO.selectAccountReceivableDetail(param);
    }
    public HashMap updateAccountReceivable(DefaultParameters param) throws DefaultEJBException {
        return accountReceivableEJBDAO.updateAccountReceivable(param);
    }
    public HashMap deleteAccountReceivable(DefaultParameters param) throws DefaultEJBException {
        return accountReceivableEJBDAO.deleteAccountReceivable(param);
    }
}