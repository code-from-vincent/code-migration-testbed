package com.switchover.legacy.ejb.governance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface KpiResultLocalHome extends EJBLocalHome {
    KpiResultLocal create() throws CreateException;
}