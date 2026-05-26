package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class MergerAcquisitionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/governance/184_mergeracquisition/MergerAcquisition_SQL.xml";
    public HashMap insertMergerAcquisition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MergerAcquisitionEJBDAO.InsertMergerAcquisition", param);
    }
    public Collection selectMergerAcquisitionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "MergerAcquisitionEJBDAO.SelectMergerAcquisitionList", param);
    }
    public HashMap selectMergerAcquisitionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MergerAcquisitionEJBDAO.SelectMergerAcquisitionDetail", param);
    }
    public HashMap updateMergerAcquisition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MergerAcquisitionEJBDAO.UpdateMergerAcquisition", param);
    }
    public HashMap deleteMergerAcquisition(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MergerAcquisitionEJBDAO.DeleteMergerAcquisition", param);
    }
}