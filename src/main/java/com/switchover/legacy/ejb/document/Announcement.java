package com.switchover.legacy.ejb.document;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Announcement extends EJBObject {
    HashMap insertAnnouncement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectAnnouncementList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectAnnouncementDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateAnnouncement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteAnnouncement(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
