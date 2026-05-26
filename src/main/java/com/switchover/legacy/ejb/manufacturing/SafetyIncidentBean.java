package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SafetyIncidentBean extends DefaultSession {
    private final SafetyIncidentEJBDAO safetyIncidentEJBDAO = new SafetyIncidentEJBDAO();
    public HashMap insertSafetyIncident(DefaultParameters param) throws DefaultEJBException {
        return safetyIncidentEJBDAO.insertSafetyIncident(param);
    }
    public Collection selectSafetyIncidentList(DefaultParameters param) throws DefaultEJBException {
        return safetyIncidentEJBDAO.selectSafetyIncidentList(param);
    }
    public HashMap selectSafetyIncidentDetail(DefaultParameters param) throws DefaultEJBException {
        return safetyIncidentEJBDAO.selectSafetyIncidentDetail(param);
    }
    public HashMap updateSafetyIncident(DefaultParameters param) throws DefaultEJBException {
        return safetyIncidentEJBDAO.updateSafetyIncident(param);
    }
    public HashMap deleteSafetyIncident(DefaultParameters param) throws DefaultEJBException {
        return safetyIncidentEJBDAO.deleteSafetyIncident(param);
    }
}