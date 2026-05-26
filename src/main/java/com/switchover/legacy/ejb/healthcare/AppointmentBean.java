package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class AppointmentBean extends DefaultSession {
    private final AppointmentEJBDAO appointmentEJBDAO = new AppointmentEJBDAO();
    public HashMap insertAppointment(DefaultParameters param) throws DefaultEJBException {
        return appointmentEJBDAO.insertAppointment(param);
    }
    public Collection selectAppointmentList(DefaultParameters param) throws DefaultEJBException {
        return appointmentEJBDAO.selectAppointmentList(param);
    }
    public HashMap selectAppointmentDetail(DefaultParameters param) throws DefaultEJBException {
        return appointmentEJBDAO.selectAppointmentDetail(param);
    }
    public HashMap updateAppointment(DefaultParameters param) throws DefaultEJBException {
        return appointmentEJBDAO.updateAppointment(param);
    }
    public HashMap deleteAppointment(DefaultParameters param) throws DefaultEJBException {
        return appointmentEJBDAO.deleteAppointment(param);
    }
}