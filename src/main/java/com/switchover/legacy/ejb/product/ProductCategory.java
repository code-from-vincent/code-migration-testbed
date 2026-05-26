package com.switchover.legacy.ejb.product;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ProductCategory extends EJBObject {
    HashMap insertProductCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProductCategoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProductCategoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProductCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProductCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
