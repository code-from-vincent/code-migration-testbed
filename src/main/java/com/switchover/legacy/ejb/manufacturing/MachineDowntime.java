package com.switchover.legacy.ejb.manufacturing;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface MachineDowntime extends EJBObject {
    HashMap insertMachineDowntime(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMachineDowntimeList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMachineDowntimeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMachineDowntime(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMachineDowntime(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
