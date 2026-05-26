package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class StockTransferEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/product/047_stocktransfer/StockTransfer_SQL.xml";
    public HashMap insertStockTransfer(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StockTransferEJBDAO.InsertStockTransfer", param);
    }
    public Collection selectStockTransferList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "StockTransferEJBDAO.SelectStockTransferList", param);
    }
    public HashMap selectStockTransferDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StockTransferEJBDAO.SelectStockTransferDetail", param);
    }
    public HashMap updateStockTransfer(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StockTransferEJBDAO.UpdateStockTransfer", param);
    }
    public HashMap deleteStockTransfer(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StockTransferEJBDAO.DeleteStockTransfer", param);
    }
}