package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface FacilityBookingLocal extends EJBLocalObject {
    HashMap insertFacilityBooking(DefaultParameters param) throws DefaultEJBException;
    Collection selectFacilityBookingList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectFacilityBookingDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateFacilityBooking(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteFacilityBooking(DefaultParameters param) throws DefaultEJBException;
}