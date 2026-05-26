package com.switchover.legacy.ejb.procurement;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ProcurementCatalog extends EJBObject {
    HashMap insertProcurementCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProcurementCatalogList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProcurementCatalogDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProcurementCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProcurementCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
