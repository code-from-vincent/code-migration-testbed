package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface InsurancePolicy extends DefaultSession {
    HashMap insertInsurancePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectInsurancePolicyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectInsurancePolicyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateInsurancePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteInsurancePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
