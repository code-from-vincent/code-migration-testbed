package com.switchover.legacy.ejb.manufacturing;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SafetyIncidentLocalHome extends EJBLocalHome {
    SafetyIncidentLocal create() throws CreateException;
}