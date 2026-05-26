package com.switchover.legacy.ejb.manufacturing;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Machine extends EJBObject {
    HashMap insertMachine(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMachineList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMachineDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMachine(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMachine(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
