package com.switchover.legacy.ejb.security;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PatchManagement extends EJBObject {
    HashMap insertPatchManagement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPatchManagementList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPatchManagementDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePatchManagement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePatchManagement(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
