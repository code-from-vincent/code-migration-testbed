package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PurchaseOrderItemEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/procurement/018_purchaseorderitem/PurchaseOrderItem_SQL.xml";
    public HashMap insertPurchaseOrderItem(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PurchaseOrderItemEJBDAO.InsertPurchaseOrderItem", param);
    }
    public Collection selectPurchaseOrderItemList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PurchaseOrderItemEJBDAO.SelectPurchaseOrderItemList", param);
    }
    public HashMap selectPurchaseOrderItemDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PurchaseOrderItemEJBDAO.SelectPurchaseOrderItemDetail", param);
    }
    public HashMap updatePurchaseOrderItem(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PurchaseOrderItemEJBDAO.UpdatePurchaseOrderItem", param);
    }
    public HashMap deletePurchaseOrderItem(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PurchaseOrderItemEJBDAO.DeletePurchaseOrderItem", param);
    }
}