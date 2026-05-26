package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class VehicleReservationBean extends DefaultSession {
    private final VehicleReservationEJBDAO vehicleReservationEJBDAO = new VehicleReservationEJBDAO();
    public HashMap insertVehicleReservation(DefaultParameters param) throws DefaultEJBException {
        return vehicleReservationEJBDAO.insertVehicleReservation(param);
    }
    public Collection selectVehicleReservationList(DefaultParameters param) throws DefaultEJBException {
        return vehicleReservationEJBDAO.selectVehicleReservationList(param);
    }
    public HashMap selectVehicleReservationDetail(DefaultParameters param) throws DefaultEJBException {
        return vehicleReservationEJBDAO.selectVehicleReservationDetail(param);
    }
    public HashMap updateVehicleReservation(DefaultParameters param) throws DefaultEJBException {
        return vehicleReservationEJBDAO.updateVehicleReservation(param);
    }
    public HashMap deleteVehicleReservation(DefaultParameters param) throws DefaultEJBException {
        return vehicleReservationEJBDAO.deleteVehicleReservation(param);
    }
}