package com.switchover.legacy.ejb.manufacturing;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface MachineLocalHome extends EJBLocalHome {
    MachineLocal create() throws CreateException;
}