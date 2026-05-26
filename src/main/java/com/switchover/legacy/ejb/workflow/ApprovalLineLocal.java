package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ApprovalLineLocal extends EJBLocalObject {
    HashMap insertApprovalLine(DefaultParameters param) throws DefaultEJBException;
    Collection selectApprovalLineList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectApprovalLineDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateApprovalLine(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteApprovalLine(DefaultParameters param) throws DefaultEJBException;
}