package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface GeneralLedger extends EJBObject {
    HashMap insertGeneralLedger(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectGeneralLedgerList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectGeneralLedgerDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateGeneralLedger(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteGeneralLedger(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
