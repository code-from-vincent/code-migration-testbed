package com.switchover.legacy.ejb.healthcare;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface InsurancePolicy extends EJBObject {
    HashMap insertInsurancePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectInsurancePolicyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectInsurancePolicyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateInsurancePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteInsurancePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
