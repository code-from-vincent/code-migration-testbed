package com.switchover.legacy.ejb.product;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ProductCategoryLocalHome extends EJBLocalHome {
    ProductCategoryLocal create() throws CreateException;
}