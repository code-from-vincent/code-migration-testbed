package com.switchover.legacy.ejb.csr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface VolunteerActivityLocalHome extends EJBLocalHome {
    VolunteerActivityLocal create() throws CreateException;
}