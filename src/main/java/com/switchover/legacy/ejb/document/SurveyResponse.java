package com.switchover.legacy.ejb.document;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SurveyResponse extends EJBObject {
    HashMap insertSurveyResponse(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSurveyResponseList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSurveyResponseDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSurveyResponse(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSurveyResponse(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
