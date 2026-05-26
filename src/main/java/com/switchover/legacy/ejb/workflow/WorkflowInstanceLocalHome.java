package com.switchover.legacy.ejb.workflow;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface WorkflowInstanceLocalHome extends EJBLocalHome {
    WorkflowInstanceLocal create() throws CreateException;
}