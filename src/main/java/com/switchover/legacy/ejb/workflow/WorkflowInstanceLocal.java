package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface WorkflowInstanceLocal extends EJBLocalObject {
    HashMap insertWorkflowInstance(DefaultParameters param) throws DefaultEJBException;
    Collection selectWorkflowInstanceList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectWorkflowInstanceDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateWorkflowInstance(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteWorkflowInstance(DefaultParameters param) throws DefaultEJBException;
}