package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PurchaseOrderItemBean extends DefaultSession {
    private final PurchaseOrderItemEJBDAO purchaseOrderItemEJBDAO = new PurchaseOrderItemEJBDAO();
    public HashMap insertPurchaseOrderItem(DefaultParameters param) throws DefaultEJBException {
        return purchaseOrderItemEJBDAO.insertPurchaseOrderItem(param);
    }
    public Collection selectPurchaseOrderItemList(DefaultParameters param) throws DefaultEJBException {
        return purchaseOrderItemEJBDAO.selectPurchaseOrderItemList(param);
    }
    public HashMap selectPurchaseOrderItemDetail(DefaultParameters param) throws DefaultEJBException {
        return purchaseOrderItemEJBDAO.selectPurchaseOrderItemDetail(param);
    }
    public HashMap updatePurchaseOrderItem(DefaultParameters param) throws DefaultEJBException {
        return purchaseOrderItemEJBDAO.updatePurchaseOrderItem(param);
    }
    public HashMap deletePurchaseOrderItem(DefaultParameters param) throws DefaultEJBException {
        return purchaseOrderItemEJBDAO.deletePurchaseOrderItem(param);
    }
}