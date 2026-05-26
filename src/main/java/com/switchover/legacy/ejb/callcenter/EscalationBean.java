package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class EscalationBean extends DefaultSession {
    private final EscalationEJBDAO escalationEJBDAO = new EscalationEJBDAO();
    public HashMap insertEscalation(DefaultParameters param) throws DefaultEJBException {
        return escalationEJBDAO.insertEscalation(param);
    }
    public Collection selectEscalationList(DefaultParameters param) throws DefaultEJBException {
        return escalationEJBDAO.selectEscalationList(param);
    }
    public HashMap selectEscalationDetail(DefaultParameters param) throws DefaultEJBException {
        return escalationEJBDAO.selectEscalationDetail(param);
    }
    public HashMap updateEscalation(DefaultParameters param) throws DefaultEJBException {
        return escalationEJBDAO.updateEscalation(param);
    }
    public HashMap deleteEscalation(DefaultParameters param) throws DefaultEJBException {
        return escalationEJBDAO.deleteEscalation(param);
    }
}