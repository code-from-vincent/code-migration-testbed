package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class RegionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/system/086_region/Region_SQL.xml";
    public HashMap insertRegion(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RegionEJBDAO.InsertRegion", param);
    }
    public Collection selectRegionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "RegionEJBDAO.SelectRegionList", param);
    }
    public HashMap selectRegionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RegionEJBDAO.SelectRegionDetail", param);
    }
    public HashMap updateRegion(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RegionEJBDAO.UpdateRegion", param);
    }
    public HashMap deleteRegion(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "RegionEJBDAO.DeleteRegion", param);
    }
}