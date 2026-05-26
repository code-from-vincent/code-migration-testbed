package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface BudgetPlan extends EJBObject {
    HashMap insertBudgetPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBudgetPlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBudgetPlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBudgetPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBudgetPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
