package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ApprovalRequestEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/workflow/172_approvalrequest/ApprovalRequest_SQL.xml";
    public HashMap insertApprovalRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApprovalRequestEJBDAO.InsertApprovalRequest", param);
    }
    public Collection selectApprovalRequestList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ApprovalRequestEJBDAO.SelectApprovalRequestList", param);
    }
    public HashMap selectApprovalRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApprovalRequestEJBDAO.SelectApprovalRequestDetail", param);
    }
    public HashMap updateApprovalRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApprovalRequestEJBDAO.UpdateApprovalRequest", param);
    }
    public HashMap deleteApprovalRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApprovalRequestEJBDAO.DeleteApprovalRequest", param);
    }
}