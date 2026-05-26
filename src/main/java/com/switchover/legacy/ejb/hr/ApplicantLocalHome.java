package com.switchover.legacy.ejb.hr;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ApplicantLocalHome extends EJBLocalHome {
    ApplicantLocal create() throws CreateException;
}