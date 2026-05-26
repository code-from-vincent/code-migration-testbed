package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Payment extends DefaultSession {
    HashMap insertPayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPaymentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPaymentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
