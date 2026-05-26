package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface CodeDetail extends DefaultSession {
    HashMap insertCodeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCodeDetailList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCodeDetailDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCodeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCodeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
