package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface InterviewSchedule extends EJBObject {
    HashMap insertInterviewSchedule(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectInterviewScheduleList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectInterviewScheduleDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateInterviewSchedule(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteInterviewSchedule(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
