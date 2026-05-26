package com.switchover.legacy.ejb.manufacturing;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface MachineDowntimeLocalHome extends EJBLocalHome {
    MachineDowntimeLocal create() throws CreateException;
}