package com.switchover.legacy.ejb.logistics;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface VehicleLocalHome extends EJBLocalHome {
    VehicleLocal create() throws CreateException;
}