package com.switchover.legacy.ejb.esg;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface EnergyUsage extends EJBObject {
    HashMap insertEnergyUsage(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectEnergyUsageList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectEnergyUsageDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateEnergyUsage(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteEnergyUsage(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
