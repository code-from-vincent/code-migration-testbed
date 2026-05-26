package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface MachineDowntime extends DefaultSession {
    HashMap insertMachineDowntime(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMachineDowntimeList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMachineDowntimeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMachineDowntime(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMachineDowntime(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
