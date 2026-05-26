package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ProcurementRequestEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/procurement/120_procurementrequest/ProcurementRequest_SQL.xml";
    public HashMap insertProcurementRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementRequestEJBDAO.InsertProcurementRequest", param);
    }
    public Collection selectProcurementRequestList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ProcurementRequestEJBDAO.SelectProcurementRequestList", param);
    }
    public HashMap selectProcurementRequestDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementRequestEJBDAO.SelectProcurementRequestDetail", param);
    }
    public HashMap updateProcurementRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementRequestEJBDAO.UpdateProcurementRequest", param);
    }
    public HashMap deleteProcurementRequest(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementRequestEJBDAO.DeleteProcurementRequest", param);
    }
}