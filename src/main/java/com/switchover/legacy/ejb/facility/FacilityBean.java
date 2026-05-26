package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class FacilityBean extends DefaultSession {
    private final FacilityEJBDAO facilityEJBDAO = new FacilityEJBDAO();
    public HashMap insertFacility(DefaultParameters param) throws DefaultEJBException {
        return facilityEJBDAO.insertFacility(param);
    }
    public Collection selectFacilityList(DefaultParameters param) throws DefaultEJBException {
        return facilityEJBDAO.selectFacilityList(param);
    }
    public HashMap selectFacilityDetail(DefaultParameters param) throws DefaultEJBException {
        return facilityEJBDAO.selectFacilityDetail(param);
    }
    public HashMap updateFacility(DefaultParameters param) throws DefaultEJBException {
        return facilityEJBDAO.updateFacility(param);
    }
    public HashMap deleteFacility(DefaultParameters param) throws DefaultEJBException {
        return facilityEJBDAO.deleteFacility(param);
    }
}