package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ProblemRecordEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/itsm/164_problemrecord/ProblemRecord_SQL.xml";
    public HashMap insertProblemRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProblemRecordEJBDAO.InsertProblemRecord", param);
    }
    public Collection selectProblemRecordList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ProblemRecordEJBDAO.SelectProblemRecordList", param);
    }
    public HashMap selectProblemRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProblemRecordEJBDAO.SelectProblemRecordDetail", param);
    }
    public HashMap updateProblemRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProblemRecordEJBDAO.UpdateProblemRecord", param);
    }
    public HashMap deleteProblemRecord(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProblemRecordEJBDAO.DeleteProblemRecord", param);
    }
}