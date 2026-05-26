package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Escalation extends DefaultSession {
    HashMap insertEscalation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectEscalationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectEscalationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateEscalation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteEscalation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
