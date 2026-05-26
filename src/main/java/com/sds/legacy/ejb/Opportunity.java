package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Opportunity extends DefaultSession {
    HashMap insertOpportunity(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectOpportunityList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectOpportunityDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateOpportunity(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteOpportunity(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
