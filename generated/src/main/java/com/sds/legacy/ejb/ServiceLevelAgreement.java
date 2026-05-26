package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ServiceLevelAgreement extends DefaultSession {
    HashMap insertServiceLevelAgreement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectServiceLevelAgreementList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectServiceLevelAgreementDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateServiceLevelAgreement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteServiceLevelAgreement(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
