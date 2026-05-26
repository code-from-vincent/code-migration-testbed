package com.switchover.legacy.ejb.procurement;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Vendor extends EJBObject {
    HashMap insertVendor(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectVendorList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectVendorDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateVendor(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteVendor(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
