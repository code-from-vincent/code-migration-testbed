package com.switchover.legacy.ejb.sales;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PartnerLocalHome extends EJBLocalHome {
    PartnerLocal create() throws CreateException;
}