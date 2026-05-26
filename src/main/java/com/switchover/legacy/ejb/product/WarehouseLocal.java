package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface WarehouseLocal extends EJBLocalObject {
    HashMap insertWarehouse(DefaultParameters param) throws DefaultEJBException;
    Collection selectWarehouseList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectWarehouseDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateWarehouse(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteWarehouse(DefaultParameters param) throws DefaultEJBException;
}