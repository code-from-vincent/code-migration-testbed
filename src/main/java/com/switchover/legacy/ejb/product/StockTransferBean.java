package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class StockTransferBean extends DefaultSession {
    private final StockTransferEJBDAO stockTransferEJBDAO = new StockTransferEJBDAO();
    public HashMap insertStockTransfer(DefaultParameters param) throws DefaultEJBException {
        return stockTransferEJBDAO.insertStockTransfer(param);
    }
    public Collection selectStockTransferList(DefaultParameters param) throws DefaultEJBException {
        return stockTransferEJBDAO.selectStockTransferList(param);
    }
    public HashMap selectStockTransferDetail(DefaultParameters param) throws DefaultEJBException {
        return stockTransferEJBDAO.selectStockTransferDetail(param);
    }
    public HashMap updateStockTransfer(DefaultParameters param) throws DefaultEJBException {
        return stockTransferEJBDAO.updateStockTransfer(param);
    }
    public HashMap deleteStockTransfer(DefaultParameters param) throws DefaultEJBException {
        return stockTransferEJBDAO.deleteStockTransfer(param);
    }
}