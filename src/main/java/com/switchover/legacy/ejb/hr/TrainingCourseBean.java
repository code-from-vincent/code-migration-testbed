package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class TrainingCourseBean extends DefaultSession {
    private final TrainingCourseEJBDAO trainingCourseEJBDAO = new TrainingCourseEJBDAO();
    public HashMap insertTrainingCourse(DefaultParameters param) throws DefaultEJBException {
        return trainingCourseEJBDAO.insertTrainingCourse(param);
    }
    public Collection selectTrainingCourseList(DefaultParameters param) throws DefaultEJBException {
        return trainingCourseEJBDAO.selectTrainingCourseList(param);
    }
    public HashMap selectTrainingCourseDetail(DefaultParameters param) throws DefaultEJBException {
        return trainingCourseEJBDAO.selectTrainingCourseDetail(param);
    }
    public HashMap updateTrainingCourse(DefaultParameters param) throws DefaultEJBException {
        return trainingCourseEJBDAO.updateTrainingCourse(param);
    }
    public HashMap deleteTrainingCourse(DefaultParameters param) throws DefaultEJBException {
        return trainingCourseEJBDAO.deleteTrainingCourse(param);
    }
}