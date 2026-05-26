package com.switchover.legacy.ejb.governance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface KpiDefinitionLocalHome extends EJBLocalHome {
    KpiDefinitionLocal create() throws CreateException;
}