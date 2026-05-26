package com.switchover.legacy.ejb.legal;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Patent extends EJBObject {
    HashMap insertPatent(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPatentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPatentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePatent(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePatent(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
