package com.switchover.legacy.ejb.legal;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface LegalCaseLocalHome extends EJBLocalHome {
    LegalCaseLocal create() throws CreateException;
}