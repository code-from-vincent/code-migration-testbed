package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface InnovationIdea extends DefaultSession {
    HashMap insertInnovationIdea(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectInnovationIdeaList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectInnovationIdeaDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateInnovationIdea(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteInnovationIdea(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
