package com.switchover.legacy.ejb.facility;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface FranchiseContractLocalHome extends EJBLocalHome {
    FranchiseContractLocal create() throws CreateException;
}