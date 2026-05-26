package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ServiceCatalogEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/itsm/161_servicecatalog/ServiceCatalog_SQL.xml";
    public HashMap insertServiceCatalog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceCatalogEJBDAO.InsertServiceCatalog", param);
    }
    public Collection selectServiceCatalogList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ServiceCatalogEJBDAO.SelectServiceCatalogList", param);
    }
    public HashMap selectServiceCatalogDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceCatalogEJBDAO.SelectServiceCatalogDetail", param);
    }
    public HashMap updateServiceCatalog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceCatalogEJBDAO.UpdateServiceCatalog", param);
    }
    public HashMap deleteServiceCatalog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ServiceCatalogEJBDAO.DeleteServiceCatalog", param);
    }
}