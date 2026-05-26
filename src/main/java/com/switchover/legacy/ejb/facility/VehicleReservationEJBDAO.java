package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class VehicleReservationEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/facility/101_vehiclereservation/VehicleReservation_SQL.xml";
    public HashMap insertVehicleReservation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VehicleReservationEJBDAO.InsertVehicleReservation", param);
    }
    public Collection selectVehicleReservationList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "VehicleReservationEJBDAO.SelectVehicleReservationList", param);
    }
    public HashMap selectVehicleReservationDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VehicleReservationEJBDAO.SelectVehicleReservationDetail", param);
    }
    public HashMap updateVehicleReservation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VehicleReservationEJBDAO.UpdateVehicleReservation", param);
    }
    public HashMap deleteVehicleReservation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "VehicleReservationEJBDAO.DeleteVehicleReservation", param);
    }
}