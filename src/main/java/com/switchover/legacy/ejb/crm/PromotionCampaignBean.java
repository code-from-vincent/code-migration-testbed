package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PromotionCampaignBean extends DefaultSession {
    private final PromotionCampaignEJBDAO promotionCampaignEJBDAO = new PromotionCampaignEJBDAO();
    public HashMap insertPromotionCampaign(DefaultParameters param) throws DefaultEJBException {
        return promotionCampaignEJBDAO.insertPromotionCampaign(param);
    }
    public Collection selectPromotionCampaignList(DefaultParameters param) throws DefaultEJBException {
        return promotionCampaignEJBDAO.selectPromotionCampaignList(param);
    }
    public HashMap selectPromotionCampaignDetail(DefaultParameters param) throws DefaultEJBException {
        return promotionCampaignEJBDAO.selectPromotionCampaignDetail(param);
    }
    public HashMap updatePromotionCampaign(DefaultParameters param) throws DefaultEJBException {
        return promotionCampaignEJBDAO.updatePromotionCampaign(param);
    }
    public HashMap deletePromotionCampaign(DefaultParameters param) throws DefaultEJBException {
        return promotionCampaignEJBDAO.deletePromotionCampaign(param);
    }
}