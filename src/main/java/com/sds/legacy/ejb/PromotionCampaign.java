package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PromotionCampaign extends DefaultSession {
    HashMap insertPromotionCampaign(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPromotionCampaignList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPromotionCampaignDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePromotionCampaign(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePromotionCampaign(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
