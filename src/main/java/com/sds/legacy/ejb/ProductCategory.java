package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ProductCategory extends DefaultSession {
    HashMap insertProductCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProductCategoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProductCategoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProductCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProductCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
