package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ServiceRequestBean extends DefaultSession {
    private final ServiceRequestEJBDAO serviceRequestEJBDAO = new ServiceRequestEJBDAO();
    public HashMap insertServiceRequest(DefaultParameters param) throws DefaultEJBException {
        return serviceRequestEJBDAO.insertServiceRequest(param);
    }
    public Collection selectServiceRequestList(DefaultParameters param) throws DefaultEJBException {
        return serviceRequestEJBDAO.selectServiceRequestList(param);
    }
    public HashMap selectServiceRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return serviceRequestEJBDAO.selectServiceRequestDetail(param);
    }
    public HashMap updateServiceRequest(DefaultParameters param) throws DefaultEJBException {
        return serviceRequestEJBDAO.updateServiceRequest(param);
    }
    public HashMap deleteServiceRequest(DefaultParameters param) throws DefaultEJBException {
        return serviceRequestEJBDAO.deleteServiceRequest(param);
    }
}