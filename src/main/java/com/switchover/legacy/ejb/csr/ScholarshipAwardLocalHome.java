package com.switchover.legacy.ejb.csr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ScholarshipAwardLocalHome extends EJBLocalHome {
    ScholarshipAwardLocal create() throws CreateException;
}