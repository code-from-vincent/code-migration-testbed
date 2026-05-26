package com.switchover.legacy.ejb.callcenter;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface RootCauseAnalysis extends EJBObject {
    HashMap insertRootCauseAnalysis(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRootCauseAnalysisList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRootCauseAnalysisDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRootCauseAnalysis(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRootCauseAnalysis(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
