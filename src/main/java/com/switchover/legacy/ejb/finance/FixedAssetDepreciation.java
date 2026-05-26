package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface FixedAssetDepreciation extends EJBObject {
    HashMap insertFixedAssetDepreciation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFixedAssetDepreciationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFixedAssetDepreciationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFixedAssetDepreciation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFixedAssetDepreciation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
