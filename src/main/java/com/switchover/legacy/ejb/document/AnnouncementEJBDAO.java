package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class AnnouncementEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/document/061_announcement/Announcement_SQL.xml";
    public HashMap insertAnnouncement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AnnouncementEJBDAO.InsertAnnouncement", param);
    }
    public Collection selectAnnouncementList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "AnnouncementEJBDAO.SelectAnnouncementList", param);
    }
    public HashMap selectAnnouncementDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AnnouncementEJBDAO.SelectAnnouncementDetail", param);
    }
    public HashMap updateAnnouncement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AnnouncementEJBDAO.UpdateAnnouncement", param);
    }
    public HashMap deleteAnnouncement(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AnnouncementEJBDAO.DeleteAnnouncement", param);
    }
}