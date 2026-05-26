package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Invoice extends EJBObject {
    HashMap insertInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectInvoiceList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectInvoiceDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteInvoice(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
