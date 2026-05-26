package com.switchover.legacy.ejb.sales;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface CustomerContact extends EJBObject {
    HashMap insertCustomerContact(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCustomerContactList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCustomerContactDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCustomerContact(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCustomerContact(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
