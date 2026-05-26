package com.switchover.legacy.ejb.document;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Survey extends EJBObject {
    HashMap insertSurvey(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSurveyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSurveyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSurvey(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSurvey(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
