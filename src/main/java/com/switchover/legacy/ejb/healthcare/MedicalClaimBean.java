package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class MedicalClaimBean extends DefaultSession {
    private final MedicalClaimEJBDAO medicalClaimEJBDAO = new MedicalClaimEJBDAO();
    public HashMap insertMedicalClaim(DefaultParameters param) throws DefaultEJBException {
        return medicalClaimEJBDAO.insertMedicalClaim(param);
    }
    public Collection selectMedicalClaimList(DefaultParameters param) throws DefaultEJBException {
        return medicalClaimEJBDAO.selectMedicalClaimList(param);
    }
    public HashMap selectMedicalClaimDetail(DefaultParameters param) throws DefaultEJBException {
        return medicalClaimEJBDAO.selectMedicalClaimDetail(param);
    }
    public HashMap updateMedicalClaim(DefaultParameters param) throws DefaultEJBException {
        return medicalClaimEJBDAO.updateMedicalClaim(param);
    }
    public HashMap deleteMedicalClaim(DefaultParameters param) throws DefaultEJBException {
        return medicalClaimEJBDAO.deleteMedicalClaim(param);
    }
}