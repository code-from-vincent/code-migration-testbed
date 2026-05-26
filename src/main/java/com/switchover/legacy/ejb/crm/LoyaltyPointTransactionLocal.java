package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface LoyaltyPointTransactionLocal extends EJBLocalObject {
    HashMap insertLoyaltyPointTransaction(DefaultParameters param) throws DefaultEJBException;
    Collection selectLoyaltyPointTransactionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectLoyaltyPointTransactionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateLoyaltyPointTransaction(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteLoyaltyPointTransaction(DefaultParameters param) throws DefaultEJBException;
}