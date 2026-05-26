package com.switchover.legacy.ejb.hr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface TrainingBudgetLocalHome extends EJBLocalHome {
    TrainingBudgetLocal create() throws CreateException;
}