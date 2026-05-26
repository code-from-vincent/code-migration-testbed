package com.switchover.legacy.ejb.manufacturing;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface BillOfMaterialLocalHome extends EJBLocalHome {
    BillOfMaterialLocal create() throws CreateException;
}