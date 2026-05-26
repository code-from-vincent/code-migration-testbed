package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface CostCenter extends EJBObject {
    HashMap insertCostCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCostCenterList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCostCenterDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCostCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCostCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
