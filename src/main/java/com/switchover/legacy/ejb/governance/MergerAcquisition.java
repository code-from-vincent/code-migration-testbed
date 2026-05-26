package com.switchover.legacy.ejb.governance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface MergerAcquisition extends EJBObject {
    HashMap insertMergerAcquisition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMergerAcquisitionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMergerAcquisitionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMergerAcquisition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMergerAcquisition(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
