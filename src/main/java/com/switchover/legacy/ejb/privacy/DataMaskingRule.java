package com.switchover.legacy.ejb.privacy;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface DataMaskingRule extends EJBObject {
    HashMap insertDataMaskingRule(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDataMaskingRuleList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDataMaskingRuleDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDataMaskingRule(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDataMaskingRule(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
