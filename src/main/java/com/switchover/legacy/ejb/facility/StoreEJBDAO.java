package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class StoreEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/facility/088_store/Store_SQL.xml";
    public HashMap insertStore(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StoreEJBDAO.InsertStore", param);
    }
    public Collection selectStoreList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "StoreEJBDAO.SelectStoreList", param);
    }
    public HashMap selectStoreDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StoreEJBDAO.SelectStoreDetail", param);
    }
    public HashMap updateStore(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StoreEJBDAO.UpdateStore", param);
    }
    public HashMap deleteStore(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "StoreEJBDAO.DeleteStore", param);
    }
}