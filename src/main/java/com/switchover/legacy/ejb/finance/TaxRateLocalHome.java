package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface TaxRateLocalHome extends EJBLocalHome {
    TaxRateLocal create() throws CreateException;
}