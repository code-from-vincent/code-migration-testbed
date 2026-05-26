package com.switchover.legacy.ejb.finance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface FixedAssetDepreciationHome extends EJBHome {
    FixedAssetDepreciation create() throws CreateException, RemoteException;
}