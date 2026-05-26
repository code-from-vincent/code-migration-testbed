package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SalesOrderEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/sales/038_salesorder/SalesOrder_SQL.xml";
    public HashMap insertSalesOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SalesOrderEJBDAO.InsertSalesOrder", param);
    }
    public Collection selectSalesOrderList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SalesOrderEJBDAO.SelectSalesOrderList", param);
    }
    public HashMap selectSalesOrderDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SalesOrderEJBDAO.SelectSalesOrderDetail", param);
    }
    public HashMap updateSalesOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SalesOrderEJBDAO.UpdateSalesOrder", param);
    }
    public HashMap deleteSalesOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SalesOrderEJBDAO.DeleteSalesOrder", param);
    }
}