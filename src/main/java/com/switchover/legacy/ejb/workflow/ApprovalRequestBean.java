package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ApprovalRequestBean extends DefaultSession {
    private final ApprovalRequestEJBDAO approvalRequestEJBDAO = new ApprovalRequestEJBDAO();
    public HashMap insertApprovalRequest(DefaultParameters param) throws DefaultEJBException {
        return approvalRequestEJBDAO.insertApprovalRequest(param);
    }
    public Collection selectApprovalRequestList(DefaultParameters param) throws DefaultEJBException {
        return approvalRequestEJBDAO.selectApprovalRequestList(param);
    }
    public HashMap selectApprovalRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return approvalRequestEJBDAO.selectApprovalRequestDetail(param);
    }
    public HashMap updateApprovalRequest(DefaultParameters param) throws DefaultEJBException {
        return approvalRequestEJBDAO.updateApprovalRequest(param);
    }
    public HashMap deleteApprovalRequest(DefaultParameters param) throws DefaultEJBException {
        return approvalRequestEJBDAO.deleteApprovalRequest(param);
    }
}