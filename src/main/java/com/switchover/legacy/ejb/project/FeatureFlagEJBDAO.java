package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class FeatureFlagEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/project/150_featureflag/FeatureFlag_SQL.xml";
    public HashMap insertFeatureFlag(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FeatureFlagEJBDAO.InsertFeatureFlag", param);
    }
    public Collection selectFeatureFlagList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "FeatureFlagEJBDAO.SelectFeatureFlagList", param);
    }
    public HashMap selectFeatureFlagDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FeatureFlagEJBDAO.SelectFeatureFlagDetail", param);
    }
    public HashMap updateFeatureFlag(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FeatureFlagEJBDAO.UpdateFeatureFlag", param);
    }
    public HashMap deleteFeatureFlag(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FeatureFlagEJBDAO.DeleteFeatureFlag", param);
    }
}