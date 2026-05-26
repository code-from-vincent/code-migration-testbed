package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class BankAccountBean extends DefaultSession {
    private final BankAccountEJBDAO bankAccountEJBDAO = new BankAccountEJBDAO();
    public HashMap insertBankAccount(DefaultParameters param) throws DefaultEJBException {
        return bankAccountEJBDAO.insertBankAccount(param);
    }
    public Collection selectBankAccountList(DefaultParameters param) throws DefaultEJBException {
        return bankAccountEJBDAO.selectBankAccountList(param);
    }
    public HashMap selectBankAccountDetail(DefaultParameters param) throws DefaultEJBException {
        return bankAccountEJBDAO.selectBankAccountDetail(param);
    }
    public HashMap updateBankAccount(DefaultParameters param) throws DefaultEJBException {
        return bankAccountEJBDAO.updateBankAccount(param);
    }
    public HashMap deleteBankAccount(DefaultParameters param) throws DefaultEJBException {
        return bankAccountEJBDAO.deleteBankAccount(param);
    }
}