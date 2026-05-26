package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface DataMaskingRule extends DefaultSession {
    HashMap insertDataMaskingRule(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDataMaskingRuleList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDataMaskingRuleDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDataMaskingRule(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDataMaskingRule(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
