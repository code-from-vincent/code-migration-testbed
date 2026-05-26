package com.switchover.legacy.ejb.itsm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ServiceRequestLocalHome extends EJBLocalHome {
    ServiceRequestLocal create() throws CreateException;
}