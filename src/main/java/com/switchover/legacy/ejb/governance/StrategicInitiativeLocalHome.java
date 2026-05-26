package com.switchover.legacy.ejb.governance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface StrategicInitiativeLocalHome extends EJBLocalHome {
    StrategicInitiativeLocal create() throws CreateException;
}