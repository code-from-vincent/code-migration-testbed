package com.switchover.legacy.ejb.project;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ReleasePlanLocalHome extends EJBLocalHome {
    ReleasePlanLocal create() throws CreateException;
}