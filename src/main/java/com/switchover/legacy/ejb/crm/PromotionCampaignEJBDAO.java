package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PromotionCampaignEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/crm/093_promotioncampaign/PromotionCampaign_SQL.xml";
    public HashMap insertPromotionCampaign(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PromotionCampaignEJBDAO.InsertPromotionCampaign", param);
    }
    public Collection selectPromotionCampaignList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PromotionCampaignEJBDAO.SelectPromotionCampaignList", param);
    }
    public HashMap selectPromotionCampaignDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PromotionCampaignEJBDAO.SelectPromotionCampaignDetail", param);
    }
    public HashMap updatePromotionCampaign(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PromotionCampaignEJBDAO.UpdatePromotionCampaign", param);
    }
    public HashMap deletePromotionCampaign(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PromotionCampaignEJBDAO.DeletePromotionCampaign", param);
    }
}