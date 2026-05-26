package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ServiceCatalog extends DefaultSession {
    HashMap insertServiceCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectServiceCatalogList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectServiceCatalogDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateServiceCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteServiceCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
