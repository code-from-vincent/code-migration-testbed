package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface TrainingCourseLocal extends EJBLocalObject {
    HashMap insertTrainingCourse(DefaultParameters param) throws DefaultEJBException;
    Collection selectTrainingCourseList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectTrainingCourseDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateTrainingCourse(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteTrainingCourse(DefaultParameters param) throws DefaultEJBException;
}