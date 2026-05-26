package com.switchover.legacy.ejb.procurement;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Contract extends EJBObject {
    HashMap insertContract(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectContractList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectContractDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateContract(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteContract(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
