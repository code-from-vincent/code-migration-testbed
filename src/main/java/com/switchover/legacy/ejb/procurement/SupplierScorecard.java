package com.switchover.legacy.ejb.procurement;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SupplierScorecard extends EJBObject {
    HashMap insertSupplierScorecard(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSupplierScorecardList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSupplierScorecardDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSupplierScorecard(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSupplierScorecard(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
