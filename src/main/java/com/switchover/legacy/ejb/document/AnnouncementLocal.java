package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface AnnouncementLocal extends EJBLocalObject {
    HashMap insertAnnouncement(DefaultParameters param) throws DefaultEJBException;
    Collection selectAnnouncementList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectAnnouncementDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateAnnouncement(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteAnnouncement(DefaultParameters param) throws DefaultEJBException;
}