package com.switchover.legacy.ejb.product;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface AssetMaintenance extends EJBObject {
    HashMap insertAssetMaintenance(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAssetMaintenanceList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAssetMaintenanceDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAssetMaintenance(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAssetMaintenance(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
