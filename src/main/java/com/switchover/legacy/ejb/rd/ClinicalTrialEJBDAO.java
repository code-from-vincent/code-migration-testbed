package com.switchover.legacy.ejb.rd;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ClinicalTrialEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/rd/130_clinicaltrial/ClinicalTrial_SQL.xml";
    public HashMap insertClinicalTrial(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ClinicalTrialEJBDAO.InsertClinicalTrial", param);
    }
    public Collection selectClinicalTrialList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ClinicalTrialEJBDAO.SelectClinicalTrialList", param);
    }
    public HashMap selectClinicalTrialDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ClinicalTrialEJBDAO.SelectClinicalTrialDetail", param);
    }
    public HashMap updateClinicalTrial(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ClinicalTrialEJBDAO.UpdateClinicalTrial", param);
    }
    public HashMap deleteClinicalTrial(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ClinicalTrialEJBDAO.DeleteClinicalTrial", param);
    }
}