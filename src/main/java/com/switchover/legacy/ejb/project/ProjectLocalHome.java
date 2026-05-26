package com.switchover.legacy.ejb.project;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ProjectLocalHome extends EJBLocalHome {
    ProjectLocal create() throws CreateException;
}