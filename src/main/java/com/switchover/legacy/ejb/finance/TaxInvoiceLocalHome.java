package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface TaxInvoiceLocalHome extends EJBLocalHome {
    TaxInvoiceLocal create() throws CreateException;
}