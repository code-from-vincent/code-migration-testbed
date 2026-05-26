package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ExchangeRate extends EJBObject {
    HashMap insertExchangeRate(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectExchangeRateList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectExchangeRateDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateExchangeRate(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteExchangeRate(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
