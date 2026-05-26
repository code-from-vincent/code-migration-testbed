package com.switchover.legacy.ejb.hr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface AttendanceRecordLocalHome extends EJBLocalHome {
    AttendanceRecordLocal create() throws CreateException;
}