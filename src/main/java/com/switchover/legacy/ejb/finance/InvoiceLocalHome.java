package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface InvoiceLocalHome extends EJBLocalHome {
    InvoiceLocal create() throws CreateException;
}