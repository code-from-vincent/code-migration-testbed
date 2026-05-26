package com.switchover.legacy.ejb.product;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class InventoryBean extends DefaultSession {
    private final InventoryEJBDAO inventoryEJBDAO = new InventoryEJBDAO();
    public HashMap insertInventory(DefaultParameters param) throws DefaultEJBException {
        return inventoryEJBDAO.insertInventory(param);
    }
    public Collection selectInventoryList(DefaultParameters param) throws DefaultEJBException {
        return inventoryEJBDAO.selectInventoryList(param);
    }
    public HashMap selectInventoryDetail(DefaultParameters param) throws DefaultEJBException {
        return inventoryEJBDAO.selectInventoryDetail(param);
    }
    public HashMap updateInventory(DefaultParameters param) throws DefaultEJBException {
        return inventoryEJBDAO.updateInventory(param);
    }
    public HashMap deleteInventory(DefaultParameters param) throws DefaultEJBException {
        return inventoryEJBDAO.deleteInventory(param);
    }
}