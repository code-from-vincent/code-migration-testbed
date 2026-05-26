package com.switchover.legacy.ejb.hr;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ApplicantEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/hr/032_applicant/Applicant_SQL.xml";
    public HashMap insertApplicant(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApplicantEJBDAO.InsertApplicant", param);
    }
    public Collection selectApplicantList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ApplicantEJBDAO.SelectApplicantList", param);
    }
    public HashMap selectApplicantDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApplicantEJBDAO.SelectApplicantDetail", param);
    }
    public HashMap updateApplicant(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApplicantEJBDAO.UpdateApplicant", param);
    }
    public HashMap deleteApplicant(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ApplicantEJBDAO.DeleteApplicant", param);
    }
}