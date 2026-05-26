package com.switchover.legacy.ejb.procurement;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ProcurementBidLocalHome extends EJBLocalHome {
    ProcurementBidLocal create() throws CreateException;
}