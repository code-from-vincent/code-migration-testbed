package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ThirdPartyRisk extends DefaultSession {
    HashMap insertThirdPartyRisk(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectThirdPartyRiskList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectThirdPartyRiskDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateThirdPartyRisk(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteThirdPartyRisk(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
