package com.switchover.legacy.ejb.product;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Asset extends EJBObject {
    HashMap insertAsset(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAssetList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAssetDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAsset(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAsset(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
