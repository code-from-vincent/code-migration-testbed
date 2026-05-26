package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CallRecordEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/callcenter/139_callrecord/CallRecord_SQL.xml";
    public HashMap insertCallRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CallRecordEJBDAO.InsertCallRecord", param);
    }
    public Collection selectCallRecordList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CallRecordEJBDAO.SelectCallRecordList", param);
    }
    public HashMap selectCallRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CallRecordEJBDAO.SelectCallRecordDetail", param);
    }
    public HashMap updateCallRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CallRecordEJBDAO.UpdateCallRecord", param);
    }
    public HashMap deleteCallRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CallRecordEJBDAO.DeleteCallRecord", param);
    }
}