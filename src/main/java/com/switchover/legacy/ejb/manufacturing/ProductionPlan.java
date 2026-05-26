package com.switchover.legacy.ejb.manufacturing;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ProductionPlan extends EJBObject {
    HashMap insertProductionPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProductionPlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProductionPlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProductionPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProductionPlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
