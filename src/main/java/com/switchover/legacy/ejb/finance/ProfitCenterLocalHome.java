package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ProfitCenterLocalHome extends EJBLocalHome {
    ProfitCenterLocal create() throws CreateException;
}