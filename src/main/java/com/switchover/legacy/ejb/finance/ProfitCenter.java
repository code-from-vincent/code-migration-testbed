package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ProfitCenter extends EJBObject {
    HashMap insertProfitCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProfitCenterList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProfitCenterDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProfitCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProfitCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
