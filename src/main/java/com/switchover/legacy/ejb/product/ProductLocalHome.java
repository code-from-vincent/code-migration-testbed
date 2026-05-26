package com.switchover.legacy.ejb.product;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ProductLocalHome extends EJBLocalHome {
    ProductLocal create() throws CreateException;
}