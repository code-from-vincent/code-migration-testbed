package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class MedicalClaimEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/healthcare/135_medicalclaim/MedicalClaim_SQL.xml";
    public HashMap insertMedicalClaim(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MedicalClaimEJBDAO.InsertMedicalClaim", param);
    }
    public Collection selectMedicalClaimList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "MedicalClaimEJBDAO.SelectMedicalClaimList", param);
    }
    public HashMap selectMedicalClaimDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MedicalClaimEJBDAO.SelectMedicalClaimDetail", param);
    }
    public HashMap updateMedicalClaim(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MedicalClaimEJBDAO.UpdateMedicalClaim", param);
    }
    public HashMap deleteMedicalClaim(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MedicalClaimEJBDAO.DeleteMedicalClaim", param);
    }
}