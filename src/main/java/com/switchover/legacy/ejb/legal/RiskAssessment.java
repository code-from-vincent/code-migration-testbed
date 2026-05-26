package com.switchover.legacy.ejb.legal;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface RiskAssessment extends EJBObject {
    HashMap insertRiskAssessment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectRiskAssessmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectRiskAssessmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateRiskAssessment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteRiskAssessment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
