package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ProcurementCatalog extends DefaultSession {
    HashMap insertProcurementCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProcurementCatalogList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProcurementCatalogDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProcurementCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProcurementCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
