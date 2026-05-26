package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ConfigurationItemEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/itsm/165_configurationitem/ConfigurationItem_SQL.xml";
    public HashMap insertConfigurationItem(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ConfigurationItemEJBDAO.InsertConfigurationItem", param);
    }
    public Collection selectConfigurationItemList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ConfigurationItemEJBDAO.SelectConfigurationItemList", param);
    }
    public HashMap selectConfigurationItemDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ConfigurationItemEJBDAO.SelectConfigurationItemDetail", param);
    }
    public HashMap updateConfigurationItem(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ConfigurationItemEJBDAO.UpdateConfigurationItem", param);
    }
    public HashMap deleteConfigurationItem(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ConfigurationItemEJBDAO.DeleteConfigurationItem", param);
    }
}