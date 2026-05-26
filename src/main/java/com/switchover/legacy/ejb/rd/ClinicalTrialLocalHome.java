package com.switchover.legacy.ejb.rd;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ClinicalTrialLocalHome extends EJBLocalHome {
    ClinicalTrialLocal create() throws CreateException;
}