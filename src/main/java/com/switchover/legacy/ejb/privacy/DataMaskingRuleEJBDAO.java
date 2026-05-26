package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DataMaskingRuleEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/privacy/176_datamaskingrule/DataMaskingRule_SQL.xml";
    public HashMap insertDataMaskingRule(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataMaskingRuleEJBDAO.InsertDataMaskingRule", param);
    }
    public Collection selectDataMaskingRuleList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DataMaskingRuleEJBDAO.SelectDataMaskingRuleList", param);
    }
    public HashMap selectDataMaskingRuleDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataMaskingRuleEJBDAO.SelectDataMaskingRuleDetail", param);
    }
    public HashMap updateDataMaskingRule(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataMaskingRuleEJBDAO.UpdateDataMaskingRule", param);
    }
    public HashMap deleteDataMaskingRule(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DataMaskingRuleEJBDAO.DeleteDataMaskingRule", param);
    }
}