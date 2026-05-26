package com.switchover.legacy.ejb.procurement;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ProcurementRequestLocalHome extends EJBLocalHome {
    ProcurementRequestLocal create() throws CreateException;
}