package com.switchover.legacy.ejb.healthcare;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PatientRecordLocalHome extends EJBLocalHome {
    PatientRecordLocal create() throws CreateException;
}