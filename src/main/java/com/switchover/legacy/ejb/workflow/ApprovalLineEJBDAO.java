package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ApprovalLineEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/workflow/171_approvalline/ApprovalLine_SQL.xml";
    public HashMap insertApprovalLine(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApprovalLineEJBDAO.InsertApprovalLine", param);
    }
    public Collection selectApprovalLineList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ApprovalLineEJBDAO.SelectApprovalLineList", param);
    }
    public HashMap selectApprovalLineDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApprovalLineEJBDAO.SelectApprovalLineDetail", param);
    }
    public HashMap updateApprovalLine(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApprovalLineEJBDAO.UpdateApprovalLine", param);
    }
    public HashMap deleteApprovalLine(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApprovalLineEJBDAO.DeleteApprovalLine", param);
    }
}