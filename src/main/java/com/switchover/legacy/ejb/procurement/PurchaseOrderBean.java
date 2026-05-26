package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PurchaseOrderBean extends DefaultSession {
    private final PurchaseOrderEJBDAO purchaseOrderEJBDAO = new PurchaseOrderEJBDAO();
    public HashMap insertPurchaseOrder(DefaultParameters param) throws DefaultEJBException {
        return purchaseOrderEJBDAO.insertPurchaseOrder(param);
    }
    public Collection selectPurchaseOrderList(DefaultParameters param) throws DefaultEJBException {
        return purchaseOrderEJBDAO.selectPurchaseOrderList(param);
    }
    public HashMap selectPurchaseOrderDetail(DefaultParameters param) throws DefaultEJBException {
        return purchaseOrderEJBDAO.selectPurchaseOrderDetail(param);
    }
    public HashMap updatePurchaseOrder(DefaultParameters param) throws DefaultEJBException {
        return purchaseOrderEJBDAO.updatePurchaseOrder(param);
    }
    public HashMap deletePurchaseOrder(DefaultParameters param) throws DefaultEJBException {
        return purchaseOrderEJBDAO.deletePurchaseOrder(param);
    }
}