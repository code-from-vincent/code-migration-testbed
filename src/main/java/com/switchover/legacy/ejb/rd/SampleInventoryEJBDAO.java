package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SampleInventoryEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/rd/129_sampleinventory/SampleInventory_SQL.xml";
    public HashMap insertSampleInventory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SampleInventoryEJBDAO.InsertSampleInventory", param);
    }
    public Collection selectSampleInventoryList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SampleInventoryEJBDAO.SelectSampleInventoryList", param);
    }
    public HashMap selectSampleInventoryDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SampleInventoryEJBDAO.SelectSampleInventoryDetail", param);
    }
    public HashMap updateSampleInventory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SampleInventoryEJBDAO.UpdateSampleInventory", param);
    }
    public HashMap deleteSampleInventory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SampleInventoryEJBDAO.DeleteSampleInventory", param);
    }
}