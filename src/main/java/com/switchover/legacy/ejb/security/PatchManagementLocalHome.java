package com.switchover.legacy.ejb.security;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PatchManagementLocalHome extends EJBLocalHome {
    PatchManagementLocal create() throws CreateException;
}