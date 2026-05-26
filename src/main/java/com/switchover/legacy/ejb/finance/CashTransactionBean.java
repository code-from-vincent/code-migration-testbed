package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CashTransactionBean extends DefaultSession {
    private final CashTransactionEJBDAO cashTransactionEJBDAO = new CashTransactionEJBDAO();
    public HashMap insertCashTransaction(DefaultParameters param) throws DefaultEJBException {
        return cashTransactionEJBDAO.insertCashTransaction(param);
    }
    public Collection selectCashTransactionList(DefaultParameters param) throws DefaultEJBException {
        return cashTransactionEJBDAO.selectCashTransactionList(param);
    }
    public HashMap selectCashTransactionDetail(DefaultParameters param) throws DefaultEJBException {
        return cashTransactionEJBDAO.selectCashTransactionDetail(param);
    }
    public HashMap updateCashTransaction(DefaultParameters param) throws DefaultEJBException {
        return cashTransactionEJBDAO.updateCashTransaction(param);
    }
    public HashMap deleteCashTransaction(DefaultParameters param) throws DefaultEJBException {
        return cashTransactionEJBDAO.deleteCashTransaction(param);
    }
}