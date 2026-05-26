package com.switchover.legacy.ejb.workflow;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface WorkflowTaskLocalHome extends EJBLocalHome {
    WorkflowTaskLocal create() throws CreateException;
}