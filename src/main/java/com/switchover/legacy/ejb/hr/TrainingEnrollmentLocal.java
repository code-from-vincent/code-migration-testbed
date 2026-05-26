package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface TrainingEnrollmentLocal extends EJBLocalObject {
    HashMap insertTrainingEnrollment(DefaultParameters param) throws DefaultEJBException;
    Collection selectTrainingEnrollmentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectTrainingEnrollmentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateTrainingEnrollment(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteTrainingEnrollment(DefaultParameters param) throws DefaultEJBException;
}