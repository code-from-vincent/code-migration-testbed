package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class OpportunityEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/sales/037_opportunity/Opportunity_SQL.xml";
    public HashMap insertOpportunity(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "OpportunityEJBDAO.InsertOpportunity", param);
    }
    public Collection selectOpportunityList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "OpportunityEJBDAO.SelectOpportunityList", param);
    }
    public HashMap selectOpportunityDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "OpportunityEJBDAO.SelectOpportunityDetail", param);
    }
    public HashMap updateOpportunity(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "OpportunityEJBDAO.UpdateOpportunity", param);
    }
    public HashMap deleteOpportunity(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "OpportunityEJBDAO.DeleteOpportunity", param);
    }
}