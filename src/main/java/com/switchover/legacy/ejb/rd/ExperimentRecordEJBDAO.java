package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ExperimentRecordEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/rd/128_experimentrecord/ExperimentRecord_SQL.xml";
    public HashMap insertExperimentRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExperimentRecordEJBDAO.InsertExperimentRecord", param);
    }
    public Collection selectExperimentRecordList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ExperimentRecordEJBDAO.SelectExperimentRecordList", param);
    }
    public HashMap selectExperimentRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExperimentRecordEJBDAO.SelectExperimentRecordDetail", param);
    }
    public HashMap updateExperimentRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExperimentRecordEJBDAO.UpdateExperimentRecord", param);
    }
    public HashMap deleteExperimentRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ExperimentRecordEJBDAO.DeleteExperimentRecord", param);
    }
}