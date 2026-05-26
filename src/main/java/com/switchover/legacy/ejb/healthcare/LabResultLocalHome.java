package com.switchover.legacy.ejb.healthcare;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface LabResultLocalHome extends EJBLocalHome {
    LabResultLocal create() throws CreateException;
}