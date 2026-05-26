package com.switchover.legacy.ejb.callcenter;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Feedback extends EJBObject {
    HashMap insertFeedback(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFeedbackList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFeedbackDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFeedback(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFeedback(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
