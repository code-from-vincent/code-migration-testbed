package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PurchaseOrderItemLocal extends EJBLocalObject {
    HashMap insertPurchaseOrderItem(DefaultParameters param) throws DefaultEJBException;
    Collection selectPurchaseOrderItemList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPurchaseOrderItemDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePurchaseOrderItem(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePurchaseOrderItem(DefaultParameters param) throws DefaultEJBException;
}