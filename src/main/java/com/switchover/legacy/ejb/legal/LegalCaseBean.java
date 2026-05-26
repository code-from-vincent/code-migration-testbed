package com.switchover.legacy.ejb.legal;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class LegalCaseBean extends DefaultSession {
    private final LegalCaseEJBDAO legalCaseEJBDAO = new LegalCaseEJBDAO();
    public HashMap insertLegalCase(DefaultParameters param) throws DefaultEJBException {
        return legalCaseEJBDAO.insertLegalCase(param);
    }
    public Collection selectLegalCaseList(DefaultParameters param) throws DefaultEJBException {
        return legalCaseEJBDAO.selectLegalCaseList(param);
    }
    public HashMap selectLegalCaseDetail(DefaultParameters param) throws DefaultEJBException {
        return legalCaseEJBDAO.selectLegalCaseDetail(param);
    }
    public HashMap updateLegalCase(DefaultParameters param) throws DefaultEJBException {
        return legalCaseEJBDAO.updateLegalCase(param);
    }
    public HashMap deleteLegalCase(DefaultParameters param) throws DefaultEJBException {
        return legalCaseEJBDAO.deleteLegalCase(param);
    }
}