package com.switchover.legacy.ejb.governance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface DividendPayment extends EJBObject {
    HashMap insertDividendPayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDividendPaymentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDividendPaymentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDividendPayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDividendPayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
