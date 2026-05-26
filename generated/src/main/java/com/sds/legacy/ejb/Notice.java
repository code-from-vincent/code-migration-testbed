package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Notice extends DefaultSession {
    HashMap insertNotice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectNoticeList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectNoticeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateNotice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteNotice(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
