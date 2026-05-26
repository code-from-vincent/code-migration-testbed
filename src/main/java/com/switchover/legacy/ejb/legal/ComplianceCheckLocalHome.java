package com.switchover.legacy.ejb.legal;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ComplianceCheckLocalHome extends EJBLocalHome {
    ComplianceCheckLocal create() throws CreateException;
}