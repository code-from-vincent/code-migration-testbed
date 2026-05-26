package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class LoyaltyAccountBean extends DefaultSession {
    private final LoyaltyAccountEJBDAO loyaltyAccountEJBDAO = new LoyaltyAccountEJBDAO();
    public HashMap insertLoyaltyAccount(DefaultParameters param) throws DefaultEJBException {
        return loyaltyAccountEJBDAO.insertLoyaltyAccount(param);
    }
    public Collection selectLoyaltyAccountList(DefaultParameters param) throws DefaultEJBException {
        return loyaltyAccountEJBDAO.selectLoyaltyAccountList(param);
    }
    public HashMap selectLoyaltyAccountDetail(DefaultParameters param) throws DefaultEJBException {
        return loyaltyAccountEJBDAO.selectLoyaltyAccountDetail(param);
    }
    public HashMap updateLoyaltyAccount(DefaultParameters param) throws DefaultEJBException {
        return loyaltyAccountEJBDAO.updateLoyaltyAccount(param);
    }
    public HashMap deleteLoyaltyAccount(DefaultParameters param) throws DefaultEJBException {
        return loyaltyAccountEJBDAO.deleteLoyaltyAccount(param);
    }
}