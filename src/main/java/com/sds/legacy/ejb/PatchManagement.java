package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PatchManagement extends DefaultSession {
    HashMap insertPatchManagement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPatchManagementList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPatchManagementDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePatchManagement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePatchManagement(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
