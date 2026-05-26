package com.switchover.legacy.ejb.crm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface MarketingSegmentLocalHome extends EJBLocalHome {
    MarketingSegmentLocal create() throws CreateException;
}