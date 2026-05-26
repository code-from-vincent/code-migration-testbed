package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class DeliveryAssignmentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/logistics/104_deliveryassignment/DeliveryAssignment_SQL.xml";
    public HashMap insertDeliveryAssignment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DeliveryAssignmentEJBDAO.InsertDeliveryAssignment", param);
    }
    public Collection selectDeliveryAssignmentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "DeliveryAssignmentEJBDAO.SelectDeliveryAssignmentList", param);
    }
    public HashMap selectDeliveryAssignmentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DeliveryAssignmentEJBDAO.SelectDeliveryAssignmentDetail", param);
    }
    public HashMap updateDeliveryAssignment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DeliveryAssignmentEJBDAO.UpdateDeliveryAssignment", param);
    }
    public HashMap deleteDeliveryAssignment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "DeliveryAssignmentEJBDAO.DeleteDeliveryAssignment", param);
    }
}