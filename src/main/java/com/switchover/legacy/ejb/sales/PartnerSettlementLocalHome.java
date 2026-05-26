package com.switchover.legacy.ejb.sales;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PartnerSettlementLocalHome extends EJBLocalHome {
    PartnerSettlementLocal create() throws CreateException;
}