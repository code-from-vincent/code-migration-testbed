package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface RiskAssessment extends DefaultSession {
    HashMap insertRiskAssessment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRiskAssessmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRiskAssessmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRiskAssessment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRiskAssessment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
