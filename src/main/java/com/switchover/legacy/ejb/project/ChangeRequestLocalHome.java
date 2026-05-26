package com.switchover.legacy.ejb.project;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ChangeRequestLocalHome extends EJBLocalHome {
    ChangeRequestLocal create() throws CreateException;
}