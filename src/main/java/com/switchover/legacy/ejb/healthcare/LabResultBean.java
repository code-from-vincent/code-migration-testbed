package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class LabResultBean extends DefaultSession {
    private final LabResultEJBDAO labResultEJBDAO = new LabResultEJBDAO();
    public HashMap insertLabResult(DefaultParameters param) throws DefaultEJBException {
        return labResultEJBDAO.insertLabResult(param);
    }
    public Collection selectLabResultList(DefaultParameters param) throws DefaultEJBException {
        return labResultEJBDAO.selectLabResultList(param);
    }
    public HashMap selectLabResultDetail(DefaultParameters param) throws DefaultEJBException {
        return labResultEJBDAO.selectLabResultDetail(param);
    }
    public HashMap updateLabResult(DefaultParameters param) throws DefaultEJBException {
        return labResultEJBDAO.updateLabResult(param);
    }
    public HashMap deleteLabResult(DefaultParameters param) throws DefaultEJBException {
        return labResultEJBDAO.deleteLabResult(param);
    }
}