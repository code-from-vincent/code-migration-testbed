package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PricePolicyEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/product/043_pricepolicy/PricePolicy_SQL.xml";
    public HashMap insertPricePolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PricePolicyEJBDAO.InsertPricePolicy", param);
    }
    public Collection selectPricePolicyList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PricePolicyEJBDAO.SelectPricePolicyList", param);
    }
    public HashMap selectPricePolicyDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PricePolicyEJBDAO.SelectPricePolicyDetail", param);
    }
    public HashMap updatePricePolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PricePolicyEJBDAO.UpdatePricePolicy", param);
    }
    public HashMap deletePricePolicy(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PricePolicyEJBDAO.DeletePricePolicy", param);
    }
}