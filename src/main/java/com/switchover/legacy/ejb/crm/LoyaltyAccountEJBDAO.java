package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class LoyaltyAccountEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/crm/090_loyaltyaccount/LoyaltyAccount_SQL.xml";
    public HashMap insertLoyaltyAccount(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoyaltyAccountEJBDAO.InsertLoyaltyAccount", param);
    }
    public Collection selectLoyaltyAccountList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "LoyaltyAccountEJBDAO.SelectLoyaltyAccountList", param);
    }
    public HashMap selectLoyaltyAccountDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoyaltyAccountEJBDAO.SelectLoyaltyAccountDetail", param);
    }
    public HashMap updateLoyaltyAccount(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoyaltyAccountEJBDAO.UpdateLoyaltyAccount", param);
    }
    public HashMap deleteLoyaltyAccount(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "LoyaltyAccountEJBDAO.DeleteLoyaltyAccount", param);
    }
}