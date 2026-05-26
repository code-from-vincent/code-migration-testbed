package com.switchover.legacy.ejb.csr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface GrantApplicationLocalHome extends EJBLocalHome {
    GrantApplicationLocal create() throws CreateException;
}