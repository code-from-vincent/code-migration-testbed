package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ContractChange extends DefaultSession {
    HashMap insertContractChange(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectContractChangeList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectContractChangeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateContractChange(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteContractChange(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
