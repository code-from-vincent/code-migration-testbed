package com.switchover.legacy.ejb.hr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface EmployeeProfileLocalHome extends EJBLocalHome {
    EmployeeProfileLocal create() throws CreateException;
}