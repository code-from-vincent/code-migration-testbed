package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Warehouse extends DefaultSession {
    HashMap insertWarehouse(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectWarehouseList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectWarehouseDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateWarehouse(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteWarehouse(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
