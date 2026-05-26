package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class LabResultEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/healthcare/134_labresult/LabResult_SQL.xml";
    public HashMap insertLabResult(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LabResultEJBDAO.InsertLabResult", param);
    }
    public Collection selectLabResultList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "LabResultEJBDAO.SelectLabResultList", param);
    }
    public HashMap selectLabResultDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LabResultEJBDAO.SelectLabResultDetail", param);
    }
    public HashMap updateLabResult(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LabResultEJBDAO.UpdateLabResult", param);
    }
    public HashMap deleteLabResult(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LabResultEJBDAO.DeleteLabResult", param);
    }
}