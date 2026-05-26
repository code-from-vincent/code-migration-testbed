package com.switchover.legacy.ejb.workflow;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface WorkflowDefinitionLocalHome extends EJBLocalHome {
    WorkflowDefinitionLocal create() throws CreateException;
}