package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class WarehouseEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/product/044_warehouse/Warehouse_SQL.xml";
    public HashMap insertWarehouse(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WarehouseEJBDAO.InsertWarehouse", param);
    }
    public Collection selectWarehouseList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "WarehouseEJBDAO.SelectWarehouseList", param);
    }
    public HashMap selectWarehouseDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WarehouseEJBDAO.SelectWarehouseDetail", param);
    }
    public HashMap updateWarehouse(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WarehouseEJBDAO.UpdateWarehouse", param);
    }
    public HashMap deleteWarehouse(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WarehouseEJBDAO.DeleteWarehouse", param);
    }
}