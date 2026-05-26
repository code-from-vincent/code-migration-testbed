package com.switchover.legacy.ejb.workflow;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ApprovalRequestLocalHome extends EJBLocalHome {
    ApprovalRequestLocal create() throws CreateException;
}