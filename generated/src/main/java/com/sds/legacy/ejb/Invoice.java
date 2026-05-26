package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Invoice extends DefaultSession {
    HashMap insertInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectInvoiceList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectInvoiceDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
