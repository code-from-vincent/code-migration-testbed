package com.switchover.legacy.ejb.manufacturing;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface WorkOrderLocalHome extends EJBLocalHome {
    WorkOrderLocal create() throws CreateException;
}