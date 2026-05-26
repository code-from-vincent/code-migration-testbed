package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface GeneralLedgerLocalHome extends EJBLocalHome {
    GeneralLedgerLocal create() throws CreateException;
}