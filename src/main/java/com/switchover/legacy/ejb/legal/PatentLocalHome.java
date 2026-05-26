package com.switchover.legacy.ejb.legal;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PatentLocalHome extends EJBLocalHome {
    PatentLocal create() throws CreateException;
}