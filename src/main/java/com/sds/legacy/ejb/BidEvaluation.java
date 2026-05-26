package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface BidEvaluation extends DefaultSession {
    HashMap insertBidEvaluation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBidEvaluationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBidEvaluationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBidEvaluation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBidEvaluation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
