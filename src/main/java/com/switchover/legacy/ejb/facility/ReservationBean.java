package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ReservationBean extends DefaultSession {
    private final ReservationEJBDAO reservationEJBDAO = new ReservationEJBDAO();
    public HashMap insertReservation(DefaultParameters param) throws DefaultEJBException {
        return reservationEJBDAO.insertReservation(param);
    }
    public Collection selectReservationList(DefaultParameters param) throws DefaultEJBException {
        return reservationEJBDAO.selectReservationList(param);
    }
    public HashMap selectReservationDetail(DefaultParameters param) throws DefaultEJBException {
        return reservationEJBDAO.selectReservationDetail(param);
    }
    public HashMap updateReservation(DefaultParameters param) throws DefaultEJBException {
        return reservationEJBDAO.updateReservation(param);
    }
    public HashMap deleteReservation(DefaultParameters param) throws DefaultEJBException {
        return reservationEJBDAO.deleteReservation(param);
    }
}