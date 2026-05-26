package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class FacilityEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/facility/098_facility/Facility_SQL.xml";
    public HashMap insertFacility(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FacilityEJBDAO.InsertFacility", param);
    }
    public Collection selectFacilityList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "FacilityEJBDAO.SelectFacilityList", param);
    }
    public HashMap selectFacilityDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FacilityEJBDAO.SelectFacilityDetail", param);
    }
    public HashMap updateFacility(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FacilityEJBDAO.UpdateFacility", param);
    }
    public HashMap deleteFacility(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FacilityEJBDAO.DeleteFacility", param);
    }
}