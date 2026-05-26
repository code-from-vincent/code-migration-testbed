package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Payment extends EJBObject {
    HashMap insertPayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPaymentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPaymentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePayment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
