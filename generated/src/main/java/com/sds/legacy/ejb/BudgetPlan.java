package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface BudgetPlan extends DefaultSession {
    HashMap insertBudgetPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBudgetPlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBudgetPlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBudgetPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBudgetPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
