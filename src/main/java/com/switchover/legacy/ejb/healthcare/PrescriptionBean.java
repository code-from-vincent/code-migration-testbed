package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PrescriptionBean extends DefaultSession {
    private final PrescriptionEJBDAO prescriptionEJBDAO = new PrescriptionEJBDAO();
    public HashMap insertPrescription(DefaultParameters param) throws DefaultEJBException {
        return prescriptionEJBDAO.insertPrescription(param);
    }
    public Collection selectPrescriptionList(DefaultParameters param) throws DefaultEJBException {
        return prescriptionEJBDAO.selectPrescriptionList(param);
    }
    public HashMap selectPrescriptionDetail(DefaultParameters param) throws DefaultEJBException {
        return prescriptionEJBDAO.selectPrescriptionDetail(param);
    }
    public HashMap updatePrescription(DefaultParameters param) throws DefaultEJBException {
        return prescriptionEJBDAO.updatePrescription(param);
    }
    public HashMap deletePrescription(DefaultParameters param) throws DefaultEJBException {
        return prescriptionEJBDAO.deletePrescription(param);
    }
}