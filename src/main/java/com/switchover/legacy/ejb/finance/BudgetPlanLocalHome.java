package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface BudgetPlanLocalHome extends EJBLocalHome {
    BudgetPlanLocal create() throws CreateException;
}