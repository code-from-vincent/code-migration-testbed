package com.switchover.legacy.ejb.itsm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ServiceCatalogLocalHome extends EJBLocalHome {
    ServiceCatalogLocal create() throws CreateException;
}