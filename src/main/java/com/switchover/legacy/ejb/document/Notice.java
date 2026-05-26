package com.switchover.legacy.ejb.document;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Notice extends EJBObject {
    HashMap insertNotice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectNoticeList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectNoticeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateNotice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteNotice(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
