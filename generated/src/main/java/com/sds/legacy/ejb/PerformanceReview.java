package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PerformanceReview extends DefaultSession {
    HashMap insertPerformanceReview(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPerformanceReviewList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPerformanceReviewDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePerformanceReview(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePerformanceReview(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
