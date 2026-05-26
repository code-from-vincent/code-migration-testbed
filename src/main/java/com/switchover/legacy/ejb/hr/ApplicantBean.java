package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ApplicantBean extends DefaultSession {
    private final ApplicantEJBDAO applicantEJBDAO = new ApplicantEJBDAO();
    public HashMap insertApplicant(DefaultParameters param) throws DefaultEJBException {
        return applicantEJBDAO.insertApplicant(param);
    }
    public Collection selectApplicantList(DefaultParameters param) throws DefaultEJBException {
        return applicantEJBDAO.selectApplicantList(param);
    }
    public HashMap selectApplicantDetail(DefaultParameters param) throws DefaultEJBException {
        return applicantEJBDAO.selectApplicantDetail(param);
    }
    public HashMap updateApplicant(DefaultParameters param) throws DefaultEJBException {
        return applicantEJBDAO.updateApplicant(param);
    }
    public HashMap deleteApplicant(DefaultParameters param) throws DefaultEJBException {
        return applicantEJBDAO.deleteApplicant(param);
    }
}