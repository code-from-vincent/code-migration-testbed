package com.switchover.legacy.ejb.healthcare;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface AppointmentLocal extends EJBLocalObject {
    HashMap insertAppointment(DefaultParameters param) throws DefaultEJBException;
    Collection selectAppointmentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectAppointmentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateAppointment(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteAppointment(DefaultParameters param) throws DefaultEJBException;
}