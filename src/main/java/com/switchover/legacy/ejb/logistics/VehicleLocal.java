package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface VehicleLocal extends EJBLocalObject {
    HashMap insertVehicle(DefaultParameters param) throws DefaultEJBException;
    Collection selectVehicleList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectVehicleDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateVehicle(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteVehicle(DefaultParameters param) throws DefaultEJBException;
}