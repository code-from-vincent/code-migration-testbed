package com.switchover.legacy.ejb.infra;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DisasterRecoveryPlanLocalHome extends EJBLocalHome {
    DisasterRecoveryPlanLocal create() throws CreateException;
}