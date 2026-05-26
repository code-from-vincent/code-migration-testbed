package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface KpiDefinition extends DefaultSession {
    HashMap insertKpiDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectKpiDefinitionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectKpiDefinitionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateKpiDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteKpiDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
