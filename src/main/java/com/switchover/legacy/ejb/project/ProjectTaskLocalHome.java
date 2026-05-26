package com.switchover.legacy.ejb.project;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ProjectTaskLocalHome extends EJBLocalHome {
    ProjectTaskLocal create() throws CreateException;
}