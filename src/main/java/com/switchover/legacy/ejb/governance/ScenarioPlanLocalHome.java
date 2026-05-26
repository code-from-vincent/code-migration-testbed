package com.switchover.legacy.ejb.governance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ScenarioPlanLocalHome extends EJBLocalHome {
    ScenarioPlanLocal create() throws CreateException;
}