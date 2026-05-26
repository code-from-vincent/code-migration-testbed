package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Faq extends DefaultSession {
    HashMap insertFaq(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFaqList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFaqDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFaq(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFaq(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
