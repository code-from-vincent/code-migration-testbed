package com.switchover.legacy.ejb.healthcare;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PolicyClaimLocalHome extends EJBLocalHome {
    PolicyClaimLocal create() throws CreateException;
}