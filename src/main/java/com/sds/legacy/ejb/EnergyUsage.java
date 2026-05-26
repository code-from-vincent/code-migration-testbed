package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface EnergyUsage extends DefaultSession {
    HashMap insertEnergyUsage(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectEnergyUsageList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectEnergyUsageDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateEnergyUsage(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteEnergyUsage(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
