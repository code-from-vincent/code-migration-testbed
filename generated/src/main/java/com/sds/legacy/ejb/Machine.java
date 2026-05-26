package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Machine extends DefaultSession {
    HashMap insertMachine(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMachineList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMachineDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMachine(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMachine(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
