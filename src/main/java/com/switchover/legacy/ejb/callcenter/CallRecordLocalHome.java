package com.switchover.legacy.ejb.callcenter;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CallRecordLocalHome extends EJBLocalHome {
    CallRecordLocal create() throws CreateException;
}