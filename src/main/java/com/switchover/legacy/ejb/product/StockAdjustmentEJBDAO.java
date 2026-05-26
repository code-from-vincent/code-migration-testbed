package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class StockAdjustmentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/product/046_stockadjustment/StockAdjustment_SQL.xml";
    public HashMap insertStockAdjustment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StockAdjustmentEJBDAO.InsertStockAdjustment", param);
    }
    public Collection selectStockAdjustmentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "StockAdjustmentEJBDAO.SelectStockAdjustmentList", param);
    }
    public HashMap selectStockAdjustmentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StockAdjustmentEJBDAO.SelectStockAdjustmentDetail", param);
    }
    public HashMap updateStockAdjustment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StockAdjustmentEJBDAO.UpdateStockAdjustment", param);
    }
    public HashMap deleteStockAdjustment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StockAdjustmentEJBDAO.DeleteStockAdjustment", param);
    }
}