package com.switchover.legacy.ejb.product;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface StockTransfer extends EJBObject {
    HashMap insertStockTransfer(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectStockTransferList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectStockTransferDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateStockTransfer(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteStockTransfer(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
