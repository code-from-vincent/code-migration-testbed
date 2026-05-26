package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ExchangeRateLocalHome extends EJBLocalHome {
    ExchangeRateLocal create() throws CreateException;
}