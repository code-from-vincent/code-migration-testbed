package com.switchover.legacy.ejb.esg;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface EnergyUsageLocalHome extends EJBLocalHome {
    EnergyUsageLocal create() throws CreateException;
}