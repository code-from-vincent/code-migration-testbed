package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PromotionCampaignLocal extends EJBLocalObject {
    HashMap insertPromotionCampaign(DefaultParameters param) throws DefaultEJBException;
    Collection selectPromotionCampaignList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPromotionCampaignDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePromotionCampaign(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePromotionCampaign(DefaultParameters param) throws DefaultEJBException;
}