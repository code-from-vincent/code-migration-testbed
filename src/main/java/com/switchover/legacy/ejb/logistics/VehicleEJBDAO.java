package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class VehicleEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/logistics/100_vehicle/Vehicle_SQL.xml";
    public HashMap insertVehicle(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VehicleEJBDAO.InsertVehicle", param);
    }
    public Collection selectVehicleList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "VehicleEJBDAO.SelectVehicleList", param);
    }
    public HashMap selectVehicleDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VehicleEJBDAO.SelectVehicleDetail", param);
    }
    public HashMap updateVehicle(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VehicleEJBDAO.UpdateVehicle", param);
    }
    public HashMap deleteVehicle(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VehicleEJBDAO.DeleteVehicle", param);
    }
}