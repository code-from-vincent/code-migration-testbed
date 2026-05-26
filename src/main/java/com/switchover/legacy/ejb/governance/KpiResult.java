package com.switchover.legacy.ejb.governance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface KpiResult extends EJBObject {
    HashMap insertKpiResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectKpiResultList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectKpiResultDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateKpiResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteKpiResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
