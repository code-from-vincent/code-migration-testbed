package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class TrainingCourseEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/025_trainingcourse/TrainingCourse_SQL.xml";
    public HashMap insertTrainingCourse(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingCourseEJBDAO.InsertTrainingCourse", param);
    }
    public Collection selectTrainingCourseList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "TrainingCourseEJBDAO.SelectTrainingCourseList", param);
    }
    public HashMap selectTrainingCourseDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingCourseEJBDAO.SelectTrainingCourseDetail", param);
    }
    public HashMap updateTrainingCourse(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingCourseEJBDAO.UpdateTrainingCourse", param);
    }
    public HashMap deleteTrainingCourse(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingCourseEJBDAO.DeleteTrainingCourse", param);
    }
}