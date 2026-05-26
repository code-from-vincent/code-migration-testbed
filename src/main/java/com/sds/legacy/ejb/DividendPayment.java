package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface DividendPayment extends DefaultSession {
    HashMap insertDividendPayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDividendPaymentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDividendPaymentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDividendPayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDividendPayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
