package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PerformanceReview extends EJBObject {
    HashMap insertPerformanceReview(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPerformanceReviewList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPerformanceReviewDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePerformanceReview(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePerformanceReview(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
