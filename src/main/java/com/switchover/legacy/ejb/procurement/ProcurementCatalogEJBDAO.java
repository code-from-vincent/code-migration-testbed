package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ProcurementCatalogEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/procurement/200_procurementcatalog/ProcurementCatalog_SQL.xml";
    public HashMap insertProcurementCatalog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementCatalogEJBDAO.InsertProcurementCatalog", param);
    }
    public Collection selectProcurementCatalogList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ProcurementCatalogEJBDAO.SelectProcurementCatalogList", param);
    }
    public HashMap selectProcurementCatalogDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementCatalogEJBDAO.SelectProcurementCatalogDetail", param);
    }
    public HashMap updateProcurementCatalog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementCatalogEJBDAO.UpdateProcurementCatalog", param);
    }
    public HashMap deleteProcurementCatalog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementCatalogEJBDAO.DeleteProcurementCatalog", param);
    }
}