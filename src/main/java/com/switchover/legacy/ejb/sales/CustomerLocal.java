package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CustomerLocal extends EJBLocalObject {
    HashMap insertCustomer(DefaultParameters param) throws DefaultEJBException;
    Collection selectCustomerList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCustomerDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCustomer(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCustomer(DefaultParameters param) throws DefaultEJBException;
}