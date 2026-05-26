package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ShipmentBean extends DefaultSession {
    private final ShipmentEJBDAO shipmentEJBDAO = new ShipmentEJBDAO();
    public HashMap insertShipment(DefaultParameters param) throws DefaultEJBException {
        return shipmentEJBDAO.insertShipment(param);
    }
    public Collection selectShipmentList(DefaultParameters param) throws DefaultEJBException {
        return shipmentEJBDAO.selectShipmentList(param);
    }
    public HashMap selectShipmentDetail(DefaultParameters param) throws DefaultEJBException {
        return shipmentEJBDAO.selectShipmentDetail(param);
    }
    public HashMap updateShipment(DefaultParameters param) throws DefaultEJBException {
        return shipmentEJBDAO.updateShipment(param);
    }
    public HashMap deleteShipment(DefaultParameters param) throws DefaultEJBException {
        return shipmentEJBDAO.deleteShipment(param);
    }
}