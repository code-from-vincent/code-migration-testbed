package com.switchover.legacy.ejb.itsm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface IncidentLocalHome extends EJBLocalHome {
    IncidentLocal create() throws CreateException;
}