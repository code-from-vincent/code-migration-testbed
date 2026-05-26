package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class AnnouncementBean extends DefaultSession {
    private final AnnouncementEJBDAO announcementEJBDAO = new AnnouncementEJBDAO();
    public HashMap insertAnnouncement(DefaultParameters param) throws DefaultEJBException {
        return announcementEJBDAO.insertAnnouncement(param);
    }
    public Collection selectAnnouncementList(DefaultParameters param) throws DefaultEJBException {
        return announcementEJBDAO.selectAnnouncementList(param);
    }
    public HashMap selectAnnouncementDetail(DefaultParameters param) throws DefaultEJBException {
        return announcementEJBDAO.selectAnnouncementDetail(param);
    }
    public HashMap updateAnnouncement(DefaultParameters param) throws DefaultEJBException {
        return announcementEJBDAO.updateAnnouncement(param);
    }
    public HashMap deleteAnnouncement(DefaultParameters param) throws DefaultEJBException {
        return announcementEJBDAO.deleteAnnouncement(param);
    }
}