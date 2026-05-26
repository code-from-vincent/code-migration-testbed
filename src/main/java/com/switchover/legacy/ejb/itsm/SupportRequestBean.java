package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SupportRequestBean extends DefaultSession {
    private final SupportRequestEJBDAO supportRequestEJBDAO = new SupportRequestEJBDAO();
    public HashMap insertSupportRequest(DefaultParameters param) throws DefaultEJBException {
        return supportRequestEJBDAO.insertSupportRequest(param);
    }
    public Collection selectSupportRequestList(DefaultParameters param) throws DefaultEJBException {
        return supportRequestEJBDAO.selectSupportRequestList(param);
    }
    public HashMap selectSupportRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return supportRequestEJBDAO.selectSupportRequestDetail(param);
    }
    public HashMap updateSupportRequest(DefaultParameters param) throws DefaultEJBException {
        return supportRequestEJBDAO.updateSupportRequest(param);
    }
    public HashMap deleteSupportRequest(DefaultParameters param) throws DefaultEJBException {
        return supportRequestEJBDAO.deleteSupportRequest(param);
    }
}