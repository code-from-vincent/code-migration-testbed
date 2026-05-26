package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface TaxInvoice extends DefaultSession {
    HashMap insertTaxInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTaxInvoiceList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTaxInvoiceDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTaxInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTaxInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
