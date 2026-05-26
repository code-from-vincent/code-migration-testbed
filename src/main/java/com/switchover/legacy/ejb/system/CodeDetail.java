package com.switchover.legacy.ejb.system;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface CodeDetail extends EJBObject {
    HashMap insertCodeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCodeDetailList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCodeDetailDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCodeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCodeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
