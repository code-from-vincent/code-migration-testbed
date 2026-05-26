package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class AppointmentEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/healthcare/132_appointment/Appointment_SQL.xml";
    public HashMap insertAppointment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AppointmentEJBDAO.InsertAppointment", param);
    }
    public Collection selectAppointmentList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "AppointmentEJBDAO.SelectAppointmentList", param);
    }
    public HashMap selectAppointmentDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AppointmentEJBDAO.SelectAppointmentDetail", param);
    }
    public HashMap updateAppointment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AppointmentEJBDAO.UpdateAppointment", param);
    }
    public HashMap deleteAppointment(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AppointmentEJBDAO.DeleteAppointment", param);
    }
}