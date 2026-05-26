package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SalesLeadEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/sales/036_saleslead/SalesLead_SQL.xml";
    public HashMap insertSalesLead(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SalesLeadEJBDAO.InsertSalesLead", param);
    }
    public Collection selectSalesLeadList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SalesLeadEJBDAO.SelectSalesLeadList", param);
    }
    public HashMap selectSalesLeadDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SalesLeadEJBDAO.SelectSalesLeadDetail", param);
    }
    public HashMap updateSalesLead(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SalesLeadEJBDAO.UpdateSalesLead", param);
    }
    public HashMap deleteSalesLead(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SalesLeadEJBDAO.DeleteSalesLead", param);
    }
}