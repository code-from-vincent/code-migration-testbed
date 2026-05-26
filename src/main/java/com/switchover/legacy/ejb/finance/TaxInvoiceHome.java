package com.switchover.legacy.ejb.finance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface TaxInvoiceHome extends EJBHome {
    TaxInvoice create() throws CreateException, RemoteException;
}