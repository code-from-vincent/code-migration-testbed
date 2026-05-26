package com.switchover.legacy.ejb.sales;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Customer extends EJBObject {
    HashMap insertCustomer(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCustomerList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCustomerDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCustomer(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCustomer(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
