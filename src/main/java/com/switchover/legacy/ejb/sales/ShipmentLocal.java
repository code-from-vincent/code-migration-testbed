package com.switchover.legacy.ejb.sales;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ShipmentLocal extends EJBLocalObject {
    HashMap insertShipment(DefaultParameters param) throws DefaultEJBException;
    Collection selectShipmentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectShipmentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateShipment(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteShipment(DefaultParameters param) throws DefaultEJBException;
}