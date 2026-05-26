package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ApprovalRequestLocal extends EJBLocalObject {
    HashMap insertApprovalRequest(DefaultParameters param) throws DefaultEJBException;
    Collection selectApprovalRequestList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectApprovalRequestDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateApprovalRequest(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteApprovalRequest(DefaultParameters param) throws DefaultEJBException;
}