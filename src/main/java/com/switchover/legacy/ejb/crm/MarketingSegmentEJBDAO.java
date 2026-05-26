package com.switchover.legacy.ejb.crm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class MarketingSegmentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/crm/094_marketingsegment/MarketingSegment_SQL.xml";
    public HashMap insertMarketingSegment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MarketingSegmentEJBDAO.InsertMarketingSegment", param);
    }
    public Collection selectMarketingSegmentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "MarketingSegmentEJBDAO.SelectMarketingSegmentList", param);
    }
    public HashMap selectMarketingSegmentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MarketingSegmentEJBDAO.SelectMarketingSegmentDetail", param);
    }
    public HashMap updateMarketingSegment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MarketingSegmentEJBDAO.UpdateMarketingSegment", param);
    }
    public HashMap deleteMarketingSegment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MarketingSegmentEJBDAO.DeleteMarketingSegment", param);
    }
}