package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ComplianceCheckEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/legal/056_compliancecheck/ComplianceCheck_SQL.xml";
    public HashMap insertComplianceCheck(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ComplianceCheckEJBDAO.InsertComplianceCheck", param);
    }
    public Collection selectComplianceCheckList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ComplianceCheckEJBDAO.SelectComplianceCheckList", param);
    }
    public HashMap selectComplianceCheckDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ComplianceCheckEJBDAO.SelectComplianceCheckDetail", param);
    }
    public HashMap updateComplianceCheck(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ComplianceCheckEJBDAO.UpdateComplianceCheck", param);
    }
    public HashMap deleteComplianceCheck(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ComplianceCheckEJBDAO.DeleteComplianceCheck", param);
    }
}