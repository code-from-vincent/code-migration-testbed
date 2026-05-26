package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class StoreBean extends DefaultSession {
    private final StoreEJBDAO storeEJBDAO = new StoreEJBDAO();
    public HashMap insertStore(DefaultParameters param) throws DefaultEJBException {
        return storeEJBDAO.insertStore(param);
    }
    public Collection selectStoreList(DefaultParameters param) throws DefaultEJBException {
        return storeEJBDAO.selectStoreList(param);
    }
    public HashMap selectStoreDetail(DefaultParameters param) throws DefaultEJBException {
        return storeEJBDAO.selectStoreDetail(param);
    }
    public HashMap updateStore(DefaultParameters param) throws DefaultEJBException {
        return storeEJBDAO.updateStore(param);
    }
    public HashMap deleteStore(DefaultParameters param) throws DefaultEJBException {
        return storeEJBDAO.deleteStore(param);
    }
}