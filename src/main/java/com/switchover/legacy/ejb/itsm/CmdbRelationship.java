package com.switchover.legacy.ejb.itsm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface CmdbRelationship extends EJBObject {
    HashMap insertCmdbRelationship(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCmdbRelationshipList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCmdbRelationshipDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCmdbRelationship(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCmdbRelationship(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
