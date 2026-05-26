package com.switchover.legacy.ejb.procurement;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ProcurementRequest extends EJBObject {
    HashMap insertProcurementRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProcurementRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProcurementRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProcurementRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProcurementRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
