package com.switchover.legacy.ejb.manufacturing;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ManufacturingStep extends EJBObject {
    HashMap insertManufacturingStep(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectManufacturingStepList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectManufacturingStepDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateManufacturingStep(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteManufacturingStep(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
