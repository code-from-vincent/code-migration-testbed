package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PatientRecordEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/healthcare/131_patientrecord/PatientRecord_SQL.xml";
    public HashMap insertPatientRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatientRecordEJBDAO.InsertPatientRecord", param);
    }
    public Collection selectPatientRecordList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PatientRecordEJBDAO.SelectPatientRecordList", param);
    }
    public HashMap selectPatientRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatientRecordEJBDAO.SelectPatientRecordDetail", param);
    }
    public HashMap updatePatientRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatientRecordEJBDAO.UpdatePatientRecord", param);
    }
    public HashMap deletePatientRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PatientRecordEJBDAO.DeletePatientRecord", param);
    }
}