package com.switchover.legacy.ejb.procurement;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface SupplierScorecardLocalHome extends EJBLocalHome {
    SupplierScorecardLocal create() throws CreateException;
}