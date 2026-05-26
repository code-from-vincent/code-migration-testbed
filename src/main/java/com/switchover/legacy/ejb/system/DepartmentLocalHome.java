package com.switchover.legacy.ejb.system;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DepartmentLocalHome extends EJBLocalHome {
    DepartmentLocal create() throws CreateException;
}