package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class WarehouseBean extends DefaultSession {
    private final WarehouseEJBDAO warehouseEJBDAO = new WarehouseEJBDAO();
    public HashMap insertWarehouse(DefaultParameters param) throws DefaultEJBException {
        return warehouseEJBDAO.insertWarehouse(param);
    }
    public Collection selectWarehouseList(DefaultParameters param) throws DefaultEJBException {
        return warehouseEJBDAO.selectWarehouseList(param);
    }
    public HashMap selectWarehouseDetail(DefaultParameters param) throws DefaultEJBException {
        return warehouseEJBDAO.selectWarehouseDetail(param);
    }
    public HashMap updateWarehouse(DefaultParameters param) throws DefaultEJBException {
        return warehouseEJBDAO.updateWarehouse(param);
    }
    public HashMap deleteWarehouse(DefaultParameters param) throws DefaultEJBException {
        return warehouseEJBDAO.deleteWarehouse(param);
    }
}