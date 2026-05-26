package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface KpiResult extends DefaultSession {
    HashMap insertKpiResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectKpiResultList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectKpiResultDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateKpiResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteKpiResult(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
