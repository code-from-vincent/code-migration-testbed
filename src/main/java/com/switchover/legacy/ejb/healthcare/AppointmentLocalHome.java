package com.switchover.legacy.ejb.healthcare;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface AppointmentLocalHome extends EJBLocalHome {
    AppointmentLocal create() throws CreateException;
}