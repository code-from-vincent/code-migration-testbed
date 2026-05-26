package com.switchover.legacy.ejb.itsm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ServiceCatalog extends EJBObject {
    HashMap insertServiceCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectServiceCatalogList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectServiceCatalogDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateServiceCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteServiceCatalog(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
