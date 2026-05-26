package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ReservationEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/facility/096_reservation/Reservation_SQL.xml";
    public HashMap insertReservation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReservationEJBDAO.InsertReservation", param);
    }
    public Collection selectReservationList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ReservationEJBDAO.SelectReservationList", param);
    }
    public HashMap selectReservationDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReservationEJBDAO.SelectReservationDetail", param);
    }
    public HashMap updateReservation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReservationEJBDAO.UpdateReservation", param);
    }
    public HashMap deleteReservation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ReservationEJBDAO.DeleteReservation", param);
    }
}