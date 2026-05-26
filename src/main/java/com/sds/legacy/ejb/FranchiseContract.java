package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface FranchiseContract extends DefaultSession {
    HashMap insertFranchiseContract(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFranchiseContractList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFranchiseContractDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFranchiseContract(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFranchiseContract(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
