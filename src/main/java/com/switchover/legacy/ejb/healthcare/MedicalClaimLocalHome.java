package com.switchover.legacy.ejb.healthcare;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface MedicalClaimLocalHome extends EJBLocalHome {
    MedicalClaimLocal create() throws CreateException;
}