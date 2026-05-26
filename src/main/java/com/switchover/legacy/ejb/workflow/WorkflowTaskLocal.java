package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface WorkflowTaskLocal extends EJBLocalObject {
    HashMap insertWorkflowTask(DefaultParameters param) throws DefaultEJBException;
    Collection selectWorkflowTaskList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectWorkflowTaskDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateWorkflowTask(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteWorkflowTask(DefaultParameters param) throws DefaultEJBException;
}