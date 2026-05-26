package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface AssetMaintenance extends DefaultSession {
    HashMap insertAssetMaintenance(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAssetMaintenanceList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAssetMaintenanceDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAssetMaintenance(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAssetMaintenance(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
