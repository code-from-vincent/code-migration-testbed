package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class IncidentBean extends DefaultSession {
    private final IncidentEJBDAO incidentEJBDAO = new IncidentEJBDAO();
    public HashMap insertIncident(DefaultParameters param) throws DefaultEJBException {
        return incidentEJBDAO.insertIncident(param);
    }
    public Collection selectIncidentList(DefaultParameters param) throws DefaultEJBException {
        return incidentEJBDAO.selectIncidentList(param);
    }
    public HashMap selectIncidentDetail(DefaultParameters param) throws DefaultEJBException {
        return incidentEJBDAO.selectIncidentDetail(param);
    }
    public HashMap updateIncident(DefaultParameters param) throws DefaultEJBException {
        return incidentEJBDAO.updateIncident(param);
    }
    public HashMap deleteIncident(DefaultParameters param) throws DefaultEJBException {
        return incidentEJBDAO.deleteIncident(param);
    }
}