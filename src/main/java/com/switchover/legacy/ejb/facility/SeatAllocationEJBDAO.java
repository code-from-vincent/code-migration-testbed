package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class SeatAllocationEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/facility/097_seatallocation/SeatAllocation_SQL.xml";
    public HashMap insertSeatAllocation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SeatAllocationEJBDAO.InsertSeatAllocation", param);
    }
    public Collection selectSeatAllocationList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "SeatAllocationEJBDAO.SelectSeatAllocationList", param);
    }
    public HashMap selectSeatAllocationDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SeatAllocationEJBDAO.SelectSeatAllocationDetail", param);
    }
    public HashMap updateSeatAllocation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SeatAllocationEJBDAO.UpdateSeatAllocation", param);
    }
    public HashMap deleteSeatAllocation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "SeatAllocationEJBDAO.DeleteSeatAllocation", param);
    }
}