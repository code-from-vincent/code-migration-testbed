package com.switchover.legacy.ejb.governance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface KpiDefinition extends EJBObject {
    HashMap insertKpiDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectKpiDefinitionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectKpiDefinitionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateKpiDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteKpiDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
