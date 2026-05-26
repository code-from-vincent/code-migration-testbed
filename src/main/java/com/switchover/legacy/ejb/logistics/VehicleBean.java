package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class VehicleBean extends DefaultSession {
    private final VehicleEJBDAO vehicleEJBDAO = new VehicleEJBDAO();
    public HashMap insertVehicle(DefaultParameters param) throws DefaultEJBException {
        return vehicleEJBDAO.insertVehicle(param);
    }
    public Collection selectVehicleList(DefaultParameters param) throws DefaultEJBException {
        return vehicleEJBDAO.selectVehicleList(param);
    }
    public HashMap selectVehicleDetail(DefaultParameters param) throws DefaultEJBException {
        return vehicleEJBDAO.selectVehicleDetail(param);
    }
    public HashMap updateVehicle(DefaultParameters param) throws DefaultEJBException {
        return vehicleEJBDAO.updateVehicle(param);
    }
    public HashMap deleteVehicle(DefaultParameters param) throws DefaultEJBException {
        return vehicleEJBDAO.deleteVehicle(param);
    }
}