package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PrescriptionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/healthcare/133_prescription/Prescription_SQL.xml";
    public HashMap insertPrescription(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PrescriptionEJBDAO.InsertPrescription", param);
    }
    public Collection selectPrescriptionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PrescriptionEJBDAO.SelectPrescriptionList", param);
    }
    public HashMap selectPrescriptionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PrescriptionEJBDAO.SelectPrescriptionDetail", param);
    }
    public HashMap updatePrescription(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PrescriptionEJBDAO.UpdatePrescription", param);
    }
    public HashMap deletePrescription(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PrescriptionEJBDAO.DeletePrescription", param);
    }
}