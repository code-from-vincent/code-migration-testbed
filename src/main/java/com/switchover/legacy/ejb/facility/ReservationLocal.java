package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ReservationLocal extends EJBLocalObject {
    HashMap insertReservation(DefaultParameters param) throws DefaultEJBException;
    Collection selectReservationList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectReservationDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateReservation(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteReservation(DefaultParameters param) throws DefaultEJBException;
}