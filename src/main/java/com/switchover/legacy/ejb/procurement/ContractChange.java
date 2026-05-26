package com.switchover.legacy.ejb.procurement;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ContractChange extends EJBObject {
    HashMap insertContractChange(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectContractChangeList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectContractChangeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateContractChange(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteContractChange(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
