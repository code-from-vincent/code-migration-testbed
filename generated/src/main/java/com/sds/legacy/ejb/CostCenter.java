package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface CostCenter extends DefaultSession {
    HashMap insertCostCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectCostCenterList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectCostCenterDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateCostCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteCostCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
