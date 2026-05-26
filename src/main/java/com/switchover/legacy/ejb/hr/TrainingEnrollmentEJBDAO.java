package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class TrainingEnrollmentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/026_trainingenrollment/TrainingEnrollment_SQL.xml";
    public HashMap insertTrainingEnrollment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingEnrollmentEJBDAO.InsertTrainingEnrollment", param);
    }
    public Collection selectTrainingEnrollmentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "TrainingEnrollmentEJBDAO.SelectTrainingEnrollmentList", param);
    }
    public HashMap selectTrainingEnrollmentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingEnrollmentEJBDAO.SelectTrainingEnrollmentDetail", param);
    }
    public HashMap updateTrainingEnrollment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingEnrollmentEJBDAO.UpdateTrainingEnrollment", param);
    }
    public HashMap deleteTrainingEnrollment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "TrainingEnrollmentEJBDAO.DeleteTrainingEnrollment", param);
    }
}