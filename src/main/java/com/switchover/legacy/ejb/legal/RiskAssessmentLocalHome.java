package com.switchover.legacy.ejb.legal;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface RiskAssessmentLocalHome extends EJBLocalHome {
    RiskAssessmentLocal create() throws CreateException;
}