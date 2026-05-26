package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface CodeGroup extends DefaultSession {
    HashMap insertCodeGroup(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCodeGroupList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCodeGroupDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCodeGroup(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCodeGroup(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
