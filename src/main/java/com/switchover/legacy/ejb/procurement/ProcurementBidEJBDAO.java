package com.switchover.legacy.ejb.procurement;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ProcurementBidEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/procurement/121_procurementbid/ProcurementBid_SQL.xml";
    public HashMap insertProcurementBid(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementBidEJBDAO.InsertProcurementBid", param);
    }
    public Collection selectProcurementBidList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ProcurementBidEJBDAO.SelectProcurementBidList", param);
    }
    public HashMap selectProcurementBidDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementBidEJBDAO.SelectProcurementBidDetail", param);
    }
    public HashMap updateProcurementBid(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementBidEJBDAO.UpdateProcurementBid", param);
    }
    public HashMap deleteProcurementBid(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ProcurementBidEJBDAO.DeleteProcurementBid", param);
    }
}