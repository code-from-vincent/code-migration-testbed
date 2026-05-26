package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ReturnOrder extends DefaultSession {
    HashMap insertReturnOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectReturnOrderList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectReturnOrderDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateReturnOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteReturnOrder(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
