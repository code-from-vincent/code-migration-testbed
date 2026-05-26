package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ConsentRecordBean extends DefaultSession {
    private final ConsentRecordEJBDAO consentRecordEJBDAO = new ConsentRecordEJBDAO();
    public HashMap insertConsentRecord(DefaultParameters param) throws DefaultEJBException {
        return consentRecordEJBDAO.insertConsentRecord(param);
    }
    public Collection selectConsentRecordList(DefaultParameters param) throws DefaultEJBException {
        return consentRecordEJBDAO.selectConsentRecordList(param);
    }
    public HashMap selectConsentRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return consentRecordEJBDAO.selectConsentRecordDetail(param);
    }
    public HashMap updateConsentRecord(DefaultParameters param) throws DefaultEJBException {
        return consentRecordEJBDAO.updateConsentRecord(param);
    }
    public HashMap deleteConsentRecord(DefaultParameters param) throws DefaultEJBException {
        return consentRecordEJBDAO.deleteConsentRecord(param);
    }
}