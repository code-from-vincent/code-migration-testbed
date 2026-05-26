package com.switchover.legacy.ejb.crm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PromotionCampaignHome extends EJBHome {
    PromotionCampaign create() throws CreateException, RemoteException;
}