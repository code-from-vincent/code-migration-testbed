package com.switchover.legacy.ejb.procurement;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ProcurementCatalogLocalHome extends EJBLocalHome {
    ProcurementCatalogLocal create() throws CreateException;
}