package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ShipmentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/sales/039_shipment/Shipment_SQL.xml";
    public HashMap insertShipment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ShipmentEJBDAO.InsertShipment", param);
    }
    public Collection selectShipmentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ShipmentEJBDAO.SelectShipmentList", param);
    }
    public HashMap selectShipmentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ShipmentEJBDAO.SelectShipmentDetail", param);
    }
    public HashMap updateShipment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ShipmentEJBDAO.UpdateShipment", param);
    }
    public HashMap deleteShipment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ShipmentEJBDAO.DeleteShipment", param);
    }
}