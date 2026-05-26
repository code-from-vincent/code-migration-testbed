package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class LeaveRequestBean extends DefaultSession {
    private final LeaveRequestEJBDAO leaveRequestEJBDAO = new LeaveRequestEJBDAO();
    public HashMap insertLeaveRequest(DefaultParameters param) throws DefaultEJBException {
        return leaveRequestEJBDAO.insertLeaveRequest(param);
    }
    public Collection selectLeaveRequestList(DefaultParameters param) throws DefaultEJBException {
        return leaveRequestEJBDAO.selectLeaveRequestList(param);
    }
    public HashMap selectLeaveRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return leaveRequestEJBDAO.selectLeaveRequestDetail(param);
    }
    public HashMap updateLeaveRequest(DefaultParameters param) throws DefaultEJBException {
        return leaveRequestEJBDAO.updateLeaveRequest(param);
    }
    public HashMap deleteLeaveRequest(DefaultParameters param) throws DefaultEJBException {
        return leaveRequestEJBDAO.deleteLeaveRequest(param);
    }
}