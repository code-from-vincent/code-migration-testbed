package com.switchover.legacy.ejb.system;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface AuditLogLocalHome extends EJBLocalHome {
    AuditLogLocal create() throws CreateException;
}