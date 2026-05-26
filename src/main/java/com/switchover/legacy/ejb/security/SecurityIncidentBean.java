package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SecurityIncidentBean extends DefaultSession {
    private final SecurityIncidentEJBDAO securityIncidentEJBDAO = new SecurityIncidentEJBDAO();
    public HashMap insertSecurityIncident(DefaultParameters param) throws DefaultEJBException {
        return securityIncidentEJBDAO.insertSecurityIncident(param);
    }
    public Collection selectSecurityIncidentList(DefaultParameters param) throws DefaultEJBException {
        return securityIncidentEJBDAO.selectSecurityIncidentList(param);
    }
    public HashMap selectSecurityIncidentDetail(DefaultParameters param) throws DefaultEJBException {
        return securityIncidentEJBDAO.selectSecurityIncidentDetail(param);
    }
    public HashMap updateSecurityIncident(DefaultParameters param) throws DefaultEJBException {
        return securityIncidentEJBDAO.updateSecurityIncident(param);
    }
    public HashMap deleteSecurityIncident(DefaultParameters param) throws DefaultEJBException {
        return securityIncidentEJBDAO.deleteSecurityIncident(param);
    }
}