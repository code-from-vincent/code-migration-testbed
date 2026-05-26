package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ConsentRecordEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/privacy/177_consentrecord/ConsentRecord_SQL.xml";
    public HashMap insertConsentRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ConsentRecordEJBDAO.InsertConsentRecord", param);
    }
    public Collection selectConsentRecordList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ConsentRecordEJBDAO.SelectConsentRecordList", param);
    }
    public HashMap selectConsentRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ConsentRecordEJBDAO.SelectConsentRecordDetail", param);
    }
    public HashMap updateConsentRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ConsentRecordEJBDAO.UpdateConsentRecord", param);
    }
    public HashMap deleteConsentRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ConsentRecordEJBDAO.DeleteConsentRecord", param);
    }
}