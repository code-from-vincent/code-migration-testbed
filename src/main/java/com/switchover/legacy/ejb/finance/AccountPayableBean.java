package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class AccountPayableBean extends DefaultSession {
    private final AccountPayableEJBDAO accountPayableEJBDAO = new AccountPayableEJBDAO();
    public HashMap insertAccountPayable(DefaultParameters param) throws DefaultEJBException {
        return accountPayableEJBDAO.insertAccountPayable(param);
    }
    public Collection selectAccountPayableList(DefaultParameters param) throws DefaultEJBException {
        return accountPayableEJBDAO.selectAccountPayableList(param);
    }
    public HashMap selectAccountPayableDetail(DefaultParameters param) throws DefaultEJBException {
        return accountPayableEJBDAO.selectAccountPayableDetail(param);
    }
    public HashMap updateAccountPayable(DefaultParameters param) throws DefaultEJBException {
        return accountPayableEJBDAO.updateAccountPayable(param);
    }
    public HashMap deleteAccountPayable(DefaultParameters param) throws DefaultEJBException {
        return accountPayableEJBDAO.deleteAccountPayable(param);
    }
}