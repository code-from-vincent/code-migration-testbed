package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface SurveyResponse extends DefaultSession {
    HashMap insertSurveyResponse(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSurveyResponseList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSurveyResponseDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSurveyResponse(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSurveyResponse(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
