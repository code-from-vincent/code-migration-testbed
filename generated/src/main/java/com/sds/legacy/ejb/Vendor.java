package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Vendor extends DefaultSession {
    HashMap insertVendor(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectVendorList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectVendorDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateVendor(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteVendor(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
