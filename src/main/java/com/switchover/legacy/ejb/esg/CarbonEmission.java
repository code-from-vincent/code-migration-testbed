package com.switchover.legacy.ejb.esg;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface CarbonEmission extends EJBObject {
    HashMap insertCarbonEmission(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCarbonEmissionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCarbonEmissionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCarbonEmission(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCarbonEmission(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
