package com.switchover.legacy.ejb.crm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PromotionCampaign extends EJBObject {
    HashMap insertPromotionCampaign(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPromotionCampaignList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPromotionCampaignDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePromotionCampaign(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePromotionCampaign(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
