package com.switchover.legacy.ejb.workflow;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface WorkflowDefinitionLocal extends EJBLocalObject {
    HashMap insertWorkflowDefinition(DefaultParameters param) throws DefaultEJBException;
    Collection selectWorkflowDefinitionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectWorkflowDefinitionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateWorkflowDefinition(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteWorkflowDefinition(DefaultParameters param) throws DefaultEJBException;
}