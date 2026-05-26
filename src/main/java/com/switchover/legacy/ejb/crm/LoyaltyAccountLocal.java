package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface LoyaltyAccountLocal extends EJBLocalObject {
    HashMap insertLoyaltyAccount(DefaultParameters param) throws DefaultEJBException;
    Collection selectLoyaltyAccountList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectLoyaltyAccountDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateLoyaltyAccount(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteLoyaltyAccount(DefaultParameters param) throws DefaultEJBException;
}