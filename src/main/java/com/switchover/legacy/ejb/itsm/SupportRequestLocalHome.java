package com.switchover.legacy.ejb.itsm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SupportRequestLocalHome extends EJBLocalHome {
    SupportRequestLocal create() throws CreateException;
}