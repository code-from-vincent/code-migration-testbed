package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface SalesOrder extends DefaultSession {
    HashMap insertSalesOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSalesOrderList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSalesOrderDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSalesOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSalesOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
