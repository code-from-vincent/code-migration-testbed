package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PurchaseOrderLocal extends EJBLocalObject {
    HashMap insertPurchaseOrder(DefaultParameters param) throws DefaultEJBException;
    Collection selectPurchaseOrderList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPurchaseOrderDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePurchaseOrder(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePurchaseOrder(DefaultParameters param) throws DefaultEJBException;
}