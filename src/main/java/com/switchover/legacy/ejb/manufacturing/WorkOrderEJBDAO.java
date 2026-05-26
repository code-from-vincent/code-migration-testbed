package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class WorkOrderEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/manufacturing/050_workorder/WorkOrder_SQL.xml";
    public HashMap insertWorkOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkOrderEJBDAO.InsertWorkOrder", param);
    }
    public Collection selectWorkOrderList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "WorkOrderEJBDAO.SelectWorkOrderList", param);
    }
    public HashMap selectWorkOrderDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkOrderEJBDAO.SelectWorkOrderDetail", param);
    }
    public HashMap updateWorkOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkOrderEJBDAO.UpdateWorkOrder", param);
    }
    public HashMap deleteWorkOrder(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "WorkOrderEJBDAO.DeleteWorkOrder", param);
    }
}