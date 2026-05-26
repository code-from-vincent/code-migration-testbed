package com.switchover.legacy.ejb.project;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ActionItemLocalHome extends EJBLocalHome {
    ActionItemLocal create() throws CreateException;
}