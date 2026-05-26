package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class InventoryEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/product/045_inventory/Inventory_SQL.xml";
    public HashMap insertInventory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InventoryEJBDAO.InsertInventory", param);
    }
    public Collection selectInventoryList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "InventoryEJBDAO.SelectInventoryList", param);
    }
    public HashMap selectInventoryDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InventoryEJBDAO.SelectInventoryDetail", param);
    }
    public HashMap updateInventory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InventoryEJBDAO.UpdateInventory", param);
    }
    public HashMap deleteInventory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "InventoryEJBDAO.DeleteInventory", param);
    }
}