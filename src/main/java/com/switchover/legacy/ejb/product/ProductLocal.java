package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ProductLocal extends EJBLocalObject {
    HashMap insertProduct(DefaultParameters param) throws DefaultEJBException;
    Collection selectProductList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectProductDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateProduct(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteProduct(DefaultParameters param) throws DefaultEJBException;
}