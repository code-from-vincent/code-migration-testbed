package com.switchover.legacy.ejb.product;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;
public interface StockAdjustment extends EJBObject {
    HashMap insertStockAdjustment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectStockAdjustmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectStockAdjustmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateStockAdjustment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteStockAdjustment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}