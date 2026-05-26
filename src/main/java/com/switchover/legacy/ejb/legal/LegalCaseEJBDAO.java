package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class LegalCaseEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/legal/124_legalcase/LegalCase_SQL.xml";
    public HashMap insertLegalCase(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LegalCaseEJBDAO.InsertLegalCase", param);
    }
    public Collection selectLegalCaseList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "LegalCaseEJBDAO.SelectLegalCaseList", param);
    }
    public HashMap selectLegalCaseDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LegalCaseEJBDAO.SelectLegalCaseDetail", param);
    }
    public HashMap updateLegalCase(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LegalCaseEJBDAO.UpdateLegalCase", param);
    }
    public HashMap deleteLegalCase(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LegalCaseEJBDAO.DeleteLegalCase", param);
    }
}