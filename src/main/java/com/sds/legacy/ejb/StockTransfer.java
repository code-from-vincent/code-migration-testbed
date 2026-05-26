package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface StockTransfer extends DefaultSession {
    HashMap insertStockTransfer(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectStockTransferList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectStockTransferDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateStockTransfer(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteStockTransfer(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
