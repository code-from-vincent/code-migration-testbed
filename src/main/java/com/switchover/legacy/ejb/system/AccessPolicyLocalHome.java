package com.switchover.legacy.ejb.system;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface AccessPolicyLocalHome extends EJBLocalHome {
    AccessPolicyLocal create() throws CreateException;
}