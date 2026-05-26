package com.switchover.legacy.ejb.system;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface CodeGroup extends EJBObject {
    HashMap insertCodeGroup(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCodeGroupList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCodeGroupDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCodeGroup(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCodeGroup(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
