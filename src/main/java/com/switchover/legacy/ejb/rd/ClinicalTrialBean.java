package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ClinicalTrialBean extends DefaultSession {
    private final ClinicalTrialEJBDAO clinicalTrialEJBDAO = new ClinicalTrialEJBDAO();
    public HashMap insertClinicalTrial(DefaultParameters param) throws DefaultEJBException {
        return clinicalTrialEJBDAO.insertClinicalTrial(param);
    }
    public Collection selectClinicalTrialList(DefaultParameters param) throws DefaultEJBException {
        return clinicalTrialEJBDAO.selectClinicalTrialList(param);
    }
    public HashMap selectClinicalTrialDetail(DefaultParameters param) throws DefaultEJBException {
        return clinicalTrialEJBDAO.selectClinicalTrialDetail(param);
    }
    public HashMap updateClinicalTrial(DefaultParameters param) throws DefaultEJBException {
        return clinicalTrialEJBDAO.updateClinicalTrial(param);
    }
    public HashMap deleteClinicalTrial(DefaultParameters param) throws DefaultEJBException {
        return clinicalTrialEJBDAO.deleteClinicalTrial(param);
    }
}