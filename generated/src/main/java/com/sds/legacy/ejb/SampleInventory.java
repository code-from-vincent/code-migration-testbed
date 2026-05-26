package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface SampleInventory extends DefaultSession {
    HashMap insertSampleInventory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSampleInventoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSampleInventoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSampleInventory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSampleInventory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
