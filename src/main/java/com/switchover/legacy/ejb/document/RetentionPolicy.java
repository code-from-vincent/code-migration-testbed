package com.switchover.legacy.ejb.document;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface RetentionPolicy extends EJBObject {
    HashMap insertRetentionPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRetentionPolicyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRetentionPolicyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRetentionPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRetentionPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
