package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ComplaintBean extends DefaultSession {
    private final ComplaintEJBDAO complaintEJBDAO = new ComplaintEJBDAO();
    public HashMap insertComplaint(DefaultParameters param) throws DefaultEJBException {
        return complaintEJBDAO.insertComplaint(param);
    }
    public Collection selectComplaintList(DefaultParameters param) throws DefaultEJBException {
        return complaintEJBDAO.selectComplaintList(param);
    }
    public HashMap selectComplaintDetail(DefaultParameters param) throws DefaultEJBException {
        return complaintEJBDAO.selectComplaintDetail(param);
    }
    public HashMap updateComplaint(DefaultParameters param) throws DefaultEJBException {
        return complaintEJBDAO.updateComplaint(param);
    }
    public HashMap deleteComplaint(DefaultParameters param) throws DefaultEJBException {
        return complaintEJBDAO.deleteComplaint(param);
    }
}