package com.switchover.legacy.ejb.logistics;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface FuelTransactionLocalHome extends EJBLocalHome {
    FuelTransactionLocal create() throws CreateException;
}