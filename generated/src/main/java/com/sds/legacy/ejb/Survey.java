package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Survey extends DefaultSession {
    HashMap insertSurvey(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSurveyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSurveyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSurvey(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSurvey(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
