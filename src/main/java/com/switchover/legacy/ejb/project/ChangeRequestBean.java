package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ChangeRequestBean extends DefaultSession {
    private final ChangeRequestEJBDAO changeRequestEJBDAO = new ChangeRequestEJBDAO();
    public HashMap insertChangeRequest(DefaultParameters param) throws DefaultEJBException {
        return changeRequestEJBDAO.insertChangeRequest(param);
    }
    public Collection selectChangeRequestList(DefaultParameters param) throws DefaultEJBException {
        return changeRequestEJBDAO.selectChangeRequestList(param);
    }
    public HashMap selectChangeRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return changeRequestEJBDAO.selectChangeRequestDetail(param);
    }
    public HashMap updateChangeRequest(DefaultParameters param) throws DefaultEJBException {
        return changeRequestEJBDAO.updateChangeRequest(param);
    }
    public HashMap deleteChangeRequest(DefaultParameters param) throws DefaultEJBException {
        return changeRequestEJBDAO.deleteChangeRequest(param);
    }
}