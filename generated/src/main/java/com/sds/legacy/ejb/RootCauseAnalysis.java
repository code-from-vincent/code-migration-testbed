package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface RootCauseAnalysis extends DefaultSession {
    HashMap insertRootCauseAnalysis(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRootCauseAnalysisList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRootCauseAnalysisDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRootCauseAnalysis(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRootCauseAnalysis(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
