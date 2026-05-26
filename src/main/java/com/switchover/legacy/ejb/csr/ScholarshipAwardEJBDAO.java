package com.switchover.legacy.ejb.csr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ScholarshipAwardEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/csr/196_scholarshipaward/ScholarshipAward_SQL.xml";
    public HashMap insertScholarshipAward(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ScholarshipAwardEJBDAO.InsertScholarshipAward", param);
    }
    public Collection selectScholarshipAwardList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ScholarshipAwardEJBDAO.SelectScholarshipAwardList", param);
    }
    public HashMap selectScholarshipAwardDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ScholarshipAwardEJBDAO.SelectScholarshipAwardDetail", param);
    }
    public HashMap updateScholarshipAward(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ScholarshipAwardEJBDAO.UpdateScholarshipAward", param);
    }
    public HashMap deleteScholarshipAward(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ScholarshipAwardEJBDAO.DeleteScholarshipAward", param);
    }
}