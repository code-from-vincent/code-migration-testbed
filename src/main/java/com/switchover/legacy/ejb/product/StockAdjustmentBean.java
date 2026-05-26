package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class StockAdjustmentBean extends DefaultSession {
    private final StockAdjustmentEJBDAO stockAdjustmentEJBDAO = new StockAdjustmentEJBDAO();
    public HashMap insertStockAdjustment(DefaultParameters param) throws DefaultEJBException {
        return stockAdjustmentEJBDAO.insertStockAdjustment(param);
    }
    public Collection selectStockAdjustmentList(DefaultParameters param) throws DefaultEJBException {
        return stockAdjustmentEJBDAO.selectStockAdjustmentList(param);
    }
    public HashMap selectStockAdjustmentDetail(DefaultParameters param) throws DefaultEJBException {
        return stockAdjustmentEJBDAO.selectStockAdjustmentDetail(param);
    }
    public HashMap updateStockAdjustment(DefaultParameters param) throws DefaultEJBException {
        return stockAdjustmentEJBDAO.updateStockAdjustment(param);
    }
    public HashMap deleteStockAdjustment(DefaultParameters param) throws DefaultEJBException {
        return stockAdjustmentEJBDAO.deleteStockAdjustment(param);
    }
}