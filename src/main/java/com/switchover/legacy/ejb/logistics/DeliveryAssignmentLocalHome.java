package com.switchover.legacy.ejb.logistics;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DeliveryAssignmentLocalHome extends EJBLocalHome {
    DeliveryAssignmentLocal create() throws CreateException;
}