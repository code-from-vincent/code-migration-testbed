package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ApprovalLineBean extends DefaultSession {
    private final ApprovalLineEJBDAO approvalLineEJBDAO = new ApprovalLineEJBDAO();
    public HashMap insertApprovalLine(DefaultParameters param) throws DefaultEJBException {
        return approvalLineEJBDAO.insertApprovalLine(param);
    }
    public Collection selectApprovalLineList(DefaultParameters param) throws DefaultEJBException {
        return approvalLineEJBDAO.selectApprovalLineList(param);
    }
    public HashMap selectApprovalLineDetail(DefaultParameters param) throws DefaultEJBException {
        return approvalLineEJBDAO.selectApprovalLineDetail(param);
    }
    public HashMap updateApprovalLine(DefaultParameters param) throws DefaultEJBException {
        return approvalLineEJBDAO.updateApprovalLine(param);
    }
    public HashMap deleteApprovalLine(DefaultParameters param) throws DefaultEJBException {
        return approvalLineEJBDAO.deleteApprovalLine(param);
    }
}