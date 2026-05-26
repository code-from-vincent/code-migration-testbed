package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class TrainingEnrollmentBean extends DefaultSession {
    private final TrainingEnrollmentEJBDAO trainingEnrollmentEJBDAO = new TrainingEnrollmentEJBDAO();
    public HashMap insertTrainingEnrollment(DefaultParameters param) throws DefaultEJBException {
        return trainingEnrollmentEJBDAO.insertTrainingEnrollment(param);
    }
    public Collection selectTrainingEnrollmentList(DefaultParameters param) throws DefaultEJBException {
        return trainingEnrollmentEJBDAO.selectTrainingEnrollmentList(param);
    }
    public HashMap selectTrainingEnrollmentDetail(DefaultParameters param) throws DefaultEJBException {
        return trainingEnrollmentEJBDAO.selectTrainingEnrollmentDetail(param);
    }
    public HashMap updateTrainingEnrollment(DefaultParameters param) throws DefaultEJBException {
        return trainingEnrollmentEJBDAO.updateTrainingEnrollment(param);
    }
    public HashMap deleteTrainingEnrollment(DefaultParameters param) throws DefaultEJBException {
        return trainingEnrollmentEJBDAO.deleteTrainingEnrollment(param);
    }
}