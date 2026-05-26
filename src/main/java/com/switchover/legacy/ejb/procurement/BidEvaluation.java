package com.switchover.legacy.ejb.procurement;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface BidEvaluation extends EJBObject {
    HashMap insertBidEvaluation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBidEvaluationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBidEvaluationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBidEvaluation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBidEvaluation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
