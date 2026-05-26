package com.switchover.legacy.ejb.product;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;
public interface Product extends EJBObject {
    HashMap insertProduct(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProductList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProductDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProduct(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProduct(DefaultParameters param) throws RemoteException, DefaultEJBException;
}