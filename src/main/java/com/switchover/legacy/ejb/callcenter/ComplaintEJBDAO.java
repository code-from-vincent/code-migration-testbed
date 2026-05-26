package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ComplaintEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/callcenter/142_complaint/Complaint_SQL.xml";
    public HashMap insertComplaint(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ComplaintEJBDAO.InsertComplaint", param);
    }
    public Collection selectComplaintList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ComplaintEJBDAO.SelectComplaintList", param);
    }
    public HashMap selectComplaintDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ComplaintEJBDAO.SelectComplaintDetail", param);
    }
    public HashMap updateComplaint(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ComplaintEJBDAO.UpdateComplaint", param);
    }
    public HashMap deleteComplaint(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ComplaintEJBDAO.DeleteComplaint", param);
    }
}