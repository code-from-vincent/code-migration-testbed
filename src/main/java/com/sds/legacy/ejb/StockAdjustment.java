package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface StockAdjustment extends DefaultSession {
    HashMap insertStockAdjustment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectStockAdjustmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectStockAdjustmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateStockAdjustment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteStockAdjustment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
