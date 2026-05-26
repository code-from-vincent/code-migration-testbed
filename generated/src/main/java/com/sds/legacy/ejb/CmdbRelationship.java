package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface CmdbRelationship extends DefaultSession {
    HashMap insertCmdbRelationship(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCmdbRelationshipList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCmdbRelationshipDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCmdbRelationship(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCmdbRelationship(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
