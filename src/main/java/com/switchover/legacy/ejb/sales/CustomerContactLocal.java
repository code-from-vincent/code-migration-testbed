package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CustomerContactLocal extends EJBLocalObject {
    HashMap insertCustomerContact(DefaultParameters param) throws DefaultEJBException;
    Collection selectCustomerContactList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCustomerContactDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCustomerContact(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCustomerContact(DefaultParameters param) throws DefaultEJBException;
}