package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ProductCategoryLocal extends EJBLocalObject {
    HashMap insertProductCategory(DefaultParameters param) throws DefaultEJBException;
    Collection selectProductCategoryList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectProductCategoryDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateProductCategory(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteProductCategory(DefaultParameters param) throws DefaultEJBException;
}