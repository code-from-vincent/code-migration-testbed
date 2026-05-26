package com.switchover.legacy.ejb.privacy;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ConsentRecordLocalHome extends EJBLocalHome {
    ConsentRecordLocal create() throws CreateException;
}