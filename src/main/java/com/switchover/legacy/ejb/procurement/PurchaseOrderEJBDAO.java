package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PurchaseOrderEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/procurement/017_purchaseorder/PurchaseOrder_SQL.xml";
    public HashMap insertPurchaseOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PurchaseOrderEJBDAO.InsertPurchaseOrder", param);
    }
    public Collection selectPurchaseOrderList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PurchaseOrderEJBDAO.SelectPurchaseOrderList", param);
    }
    public HashMap selectPurchaseOrderDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PurchaseOrderEJBDAO.SelectPurchaseOrderDetail", param);
    }
    public HashMap updatePurchaseOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PurchaseOrderEJBDAO.UpdatePurchaseOrder", param);
    }
    public HashMap deletePurchaseOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PurchaseOrderEJBDAO.DeletePurchaseOrder", param);
    }
}