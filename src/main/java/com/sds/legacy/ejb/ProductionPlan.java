package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ProductionPlan extends DefaultSession {
    HashMap insertProductionPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProductionPlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProductionPlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProductionPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProductionPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
