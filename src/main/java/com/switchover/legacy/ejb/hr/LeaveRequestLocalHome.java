package com.switchover.legacy.ejb.hr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface LeaveRequestLocalHome extends EJBLocalHome {
    LeaveRequestLocal create() throws CreateException;
}