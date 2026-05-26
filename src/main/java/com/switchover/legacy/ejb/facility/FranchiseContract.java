package com.switchover.legacy.ejb.facility;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface FranchiseContract extends EJBObject {
    HashMap insertFranchiseContract(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFranchiseContractList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFranchiseContractDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFranchiseContract(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFranchiseContract(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
