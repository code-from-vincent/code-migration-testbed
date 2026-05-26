package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class LoyaltyPointTransactionBean extends DefaultSession {
    private final LoyaltyPointTransactionEJBDAO loyaltyPointTransactionEJBDAO = new LoyaltyPointTransactionEJBDAO();
    public HashMap insertLoyaltyPointTransaction(DefaultParameters param) throws DefaultEJBException {
        return loyaltyPointTransactionEJBDAO.insertLoyaltyPointTransaction(param);
    }
    public Collection selectLoyaltyPointTransactionList(DefaultParameters param) throws DefaultEJBException {
        return loyaltyPointTransactionEJBDAO.selectLoyaltyPointTransactionList(param);
    }
    public HashMap selectLoyaltyPointTransactionDetail(DefaultParameters param) throws DefaultEJBException {
        return loyaltyPointTransactionEJBDAO.selectLoyaltyPointTransactionDetail(param);
    }
    public HashMap updateLoyaltyPointTransaction(DefaultParameters param) throws DefaultEJBException {
        return loyaltyPointTransactionEJBDAO.updateLoyaltyPointTransaction(param);
    }
    public HashMap deleteLoyaltyPointTransaction(DefaultParameters param) throws DefaultEJBException {
        return loyaltyPointTransactionEJBDAO.deleteLoyaltyPointTransaction(param);
    }
}