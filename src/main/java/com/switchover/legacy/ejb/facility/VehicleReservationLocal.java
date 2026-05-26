package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface VehicleReservationLocal extends EJBLocalObject {
    HashMap insertVehicleReservation(DefaultParameters param) throws DefaultEJBException;
    Collection selectVehicleReservationList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectVehicleReservationDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateVehicleReservation(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteVehicleReservation(DefaultParameters param) throws DefaultEJBException;
}