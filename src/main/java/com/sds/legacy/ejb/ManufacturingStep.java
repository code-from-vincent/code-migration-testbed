package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ManufacturingStep extends DefaultSession {
    HashMap insertManufacturingStep(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectManufacturingStepList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectManufacturingStepDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateManufacturingStep(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteManufacturingStep(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
