package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class FacilityBookingEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/facility/099_facilitybooking/FacilityBooking_SQL.xml";
    public HashMap insertFacilityBooking(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FacilityBookingEJBDAO.InsertFacilityBooking", param);
    }
    public Collection selectFacilityBookingList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "FacilityBookingEJBDAO.SelectFacilityBookingList", param);
    }
    public HashMap selectFacilityBookingDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FacilityBookingEJBDAO.SelectFacilityBookingDetail", param);
    }
    public HashMap updateFacilityBooking(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FacilityBookingEJBDAO.UpdateFacilityBooking", param);
    }
    public HashMap deleteFacilityBooking(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FacilityBookingEJBDAO.DeleteFacilityBooking", param);
    }
}