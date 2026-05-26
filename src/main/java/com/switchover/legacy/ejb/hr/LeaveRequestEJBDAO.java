package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class LeaveRequestEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/027_leaverequest/LeaveRequest_SQL.xml";
    public HashMap insertLeaveRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LeaveRequestEJBDAO.InsertLeaveRequest", param);
    }
    public Collection selectLeaveRequestList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "LeaveRequestEJBDAO.SelectLeaveRequestList", param);
    }
    public HashMap selectLeaveRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LeaveRequestEJBDAO.SelectLeaveRequestDetail", param);
    }
    public HashMap updateLeaveRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LeaveRequestEJBDAO.UpdateLeaveRequest", param);
    }
    public HashMap deleteLeaveRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LeaveRequestEJBDAO.DeleteLeaveRequest", param);
    }
}