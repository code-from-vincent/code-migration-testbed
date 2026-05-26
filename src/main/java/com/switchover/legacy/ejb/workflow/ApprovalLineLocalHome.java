package com.switchover.legacy.ejb.workflow;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ApprovalLineLocalHome extends EJBLocalHome {
    ApprovalLineLocal create() throws CreateException;
}