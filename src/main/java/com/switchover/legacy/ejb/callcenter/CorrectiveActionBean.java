package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CorrectiveActionBean extends DefaultSession {
    private final CorrectiveActionEJBDAO correctiveActionEJBDAO = new CorrectiveActionEJBDAO();
    public HashMap insertCorrectiveAction(DefaultParameters param) throws DefaultEJBException {
        return correctiveActionEJBDAO.insertCorrectiveAction(param);
    }
    public Collection selectCorrectiveActionList(DefaultParameters param) throws DefaultEJBException {
        return correctiveActionEJBDAO.selectCorrectiveActionList(param);
    }
    public HashMap selectCorrectiveActionDetail(DefaultParameters param) throws DefaultEJBException {
        return correctiveActionEJBDAO.selectCorrectiveActionDetail(param);
    }
    public HashMap updateCorrectiveAction(DefaultParameters param) throws DefaultEJBException {
        return correctiveActionEJBDAO.updateCorrectiveAction(param);
    }
    public HashMap deleteCorrectiveAction(DefaultParameters param) throws DefaultEJBException {
        return correctiveActionEJBDAO.deleteCorrectiveAction(param);
    }
}