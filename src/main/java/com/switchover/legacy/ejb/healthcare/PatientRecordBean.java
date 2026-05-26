package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PatientRecordBean extends DefaultSession {
    private final PatientRecordEJBDAO patientRecordEJBDAO = new PatientRecordEJBDAO();
    public HashMap insertPatientRecord(DefaultParameters param) throws DefaultEJBException {
        return patientRecordEJBDAO.insertPatientRecord(param);
    }
    public Collection selectPatientRecordList(DefaultParameters param) throws DefaultEJBException {
        return patientRecordEJBDAO.selectPatientRecordList(param);
    }
    public HashMap selectPatientRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return patientRecordEJBDAO.selectPatientRecordDetail(param);
    }
    public HashMap updatePatientRecord(DefaultParameters param) throws DefaultEJBException {
        return patientRecordEJBDAO.updatePatientRecord(param);
    }
    public HashMap deletePatientRecord(DefaultParameters param) throws DefaultEJBException {
        return patientRecordEJBDAO.deletePatientRecord(param);
    }
}