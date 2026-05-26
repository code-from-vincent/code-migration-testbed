package com.switchover.legacy.ejb.security;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SecurityIncidentLocalHome extends EJBLocalHome {
    SecurityIncidentLocal create() throws CreateException;
}