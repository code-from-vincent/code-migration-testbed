package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class NoticeEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/document/008_notice/Notice_SQL.xml";
    public HashMap insertNotice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NoticeEJBDAO.InsertNotice", param);
    }
    public Collection selectNoticeList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "NoticeEJBDAO.SelectNoticeList", param);
    }
    public HashMap selectNoticeDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NoticeEJBDAO.SelectNoticeDetail", param);
    }
    public HashMap updateNotice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NoticeEJBDAO.UpdateNotice", param);
    }
    public HashMap deleteNotice(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "NoticeEJBDAO.DeleteNotice", param);
    }
}