package com.switchover.legacy.ejb.itsm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ConfigurationItemLocalHome extends EJBLocalHome {
    ConfigurationItemLocal create() throws CreateException;
}