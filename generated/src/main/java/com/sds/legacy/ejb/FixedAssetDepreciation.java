package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface FixedAssetDepreciation extends DefaultSession {
    HashMap insertFixedAssetDepreciation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFixedAssetDepreciationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFixedAssetDepreciationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFixedAssetDepreciation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFixedAssetDepreciation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
