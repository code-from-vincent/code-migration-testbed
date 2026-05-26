package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ArchiveRecordEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/document/174_archiverecord/ArchiveRecord_SQL.xml";
    public HashMap insertArchiveRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ArchiveRecordEJBDAO.InsertArchiveRecord", param);
    }
    public Collection selectArchiveRecordList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ArchiveRecordEJBDAO.SelectArchiveRecordList", param);
    }
    public HashMap selectArchiveRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ArchiveRecordEJBDAO.SelectArchiveRecordDetail", param);
    }
    public HashMap updateArchiveRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ArchiveRecordEJBDAO.UpdateArchiveRecord", param);
    }
    public HashMap deleteArchiveRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ArchiveRecordEJBDAO.DeleteArchiveRecord", param);
    }
}