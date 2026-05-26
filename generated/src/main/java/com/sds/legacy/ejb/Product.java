package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Product extends DefaultSession {
    HashMap insertProduct(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProductList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProductDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProduct(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProduct(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
