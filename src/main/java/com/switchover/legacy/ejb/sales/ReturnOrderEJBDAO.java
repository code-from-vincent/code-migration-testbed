package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ReturnOrderEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/sales/040_returnorder/ReturnOrder_SQL.xml";
    public HashMap insertReturnOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReturnOrderEJBDAO.InsertReturnOrder", param);
    }
    public Collection selectReturnOrderList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ReturnOrderEJBDAO.SelectReturnOrderList", param);
    }
    public HashMap selectReturnOrderDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReturnOrderEJBDAO.SelectReturnOrderDetail", param);
    }
    public HashMap updateReturnOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReturnOrderEJBDAO.UpdateReturnOrder", param);
    }
    public HashMap deleteReturnOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReturnOrderEJBDAO.DeleteReturnOrder", param);
    }
}