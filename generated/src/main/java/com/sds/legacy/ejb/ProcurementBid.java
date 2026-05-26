package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ProcurementBid extends DefaultSession {
    HashMap insertProcurementBid(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProcurementBidList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProcurementBidDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProcurementBid(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProcurementBid(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
