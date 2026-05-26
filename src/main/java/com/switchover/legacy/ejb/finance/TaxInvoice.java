package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface TaxInvoice extends EJBObject {
    HashMap insertTaxInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTaxInvoiceList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTaxInvoiceDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTaxInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTaxInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
