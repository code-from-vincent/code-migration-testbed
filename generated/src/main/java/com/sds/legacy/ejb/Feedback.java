package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Feedback extends DefaultSession {
    HashMap insertFeedback(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFeedbackList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFeedbackDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFeedback(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFeedback(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
