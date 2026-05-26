package com.switchover.legacy.ejb.itsm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ServiceLevelAgreement extends EJBObject {
    HashMap insertServiceLevelAgreement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectServiceLevelAgreementList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectServiceLevelAgreementDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateServiceLevelAgreement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteServiceLevelAgreement(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
