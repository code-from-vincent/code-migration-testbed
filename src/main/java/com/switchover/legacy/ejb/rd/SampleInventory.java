package com.switchover.legacy.ejb.rd;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SampleInventory extends EJBObject {
    HashMap insertSampleInventory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSampleInventoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSampleInventoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSampleInventory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSampleInventory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
