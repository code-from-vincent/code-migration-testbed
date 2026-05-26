package com.switchover.legacy.ejb.legal;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface TrademarkLocalHome extends EJBLocalHome {
    TrademarkLocal create() throws CreateException;
}