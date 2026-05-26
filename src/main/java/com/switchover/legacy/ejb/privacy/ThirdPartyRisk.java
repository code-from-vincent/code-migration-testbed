package com.switchover.legacy.ejb.privacy;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ThirdPartyRisk extends EJBObject {
    HashMap insertThirdPartyRisk(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectThirdPartyRiskList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectThirdPartyRiskDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateThirdPartyRisk(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteThirdPartyRisk(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
