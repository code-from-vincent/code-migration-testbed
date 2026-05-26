package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface InventoryLocal extends EJBLocalObject {
    HashMap insertInventory(DefaultParameters param) throws DefaultEJBException;
    Collection selectInventoryList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectInventoryDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateInventory(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteInventory(DefaultParameters param) throws DefaultEJBException;
}