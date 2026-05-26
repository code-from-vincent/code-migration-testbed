package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PreventiveActionBean extends DefaultSession {
    private final PreventiveActionEJBDAO preventiveActionEJBDAO = new PreventiveActionEJBDAO();
    public HashMap insertPreventiveAction(DefaultParameters param) throws DefaultEJBException {
        return preventiveActionEJBDAO.insertPreventiveAction(param);
    }
    public Collection selectPreventiveActionList(DefaultParameters param) throws DefaultEJBException {
        return preventiveActionEJBDAO.selectPreventiveActionList(param);
    }
    public HashMap selectPreventiveActionDetail(DefaultParameters param) throws DefaultEJBException {
        return preventiveActionEJBDAO.selectPreventiveActionDetail(param);
    }
    public HashMap updatePreventiveAction(DefaultParameters param) throws DefaultEJBException {
        return preventiveActionEJBDAO.updatePreventiveAction(param);
    }
    public HashMap deletePreventiveAction(DefaultParameters param) throws DefaultEJBException {
        return preventiveActionEJBDAO.deletePreventiveAction(param);
    }
}