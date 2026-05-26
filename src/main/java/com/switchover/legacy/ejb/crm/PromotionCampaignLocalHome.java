package com.switchover.legacy.ejb.crm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface PromotionCampaignLocalHome extends EJBLocalHome {
    PromotionCampaignLocal create() throws CreateException;
}