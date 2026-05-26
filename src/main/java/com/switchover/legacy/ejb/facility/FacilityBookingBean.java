package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class FacilityBookingBean extends DefaultSession {
    private final FacilityBookingEJBDAO facilityBookingEJBDAO = new FacilityBookingEJBDAO();
    public HashMap insertFacilityBooking(DefaultParameters param) throws DefaultEJBException {
        return facilityBookingEJBDAO.insertFacilityBooking(param);
    }
    public Collection selectFacilityBookingList(DefaultParameters param) throws DefaultEJBException {
        return facilityBookingEJBDAO.selectFacilityBookingList(param);
    }
    public HashMap selectFacilityBookingDetail(DefaultParameters param) throws DefaultEJBException {
        return facilityBookingEJBDAO.selectFacilityBookingDetail(param);
    }
    public HashMap updateFacilityBooking(DefaultParameters param) throws DefaultEJBException {
        return facilityBookingEJBDAO.updateFacilityBooking(param);
    }
    public HashMap deleteFacilityBooking(DefaultParameters param) throws DefaultEJBException {
        return facilityBookingEJBDAO.deleteFacilityBooking(param);
    }
}