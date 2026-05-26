package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface InterviewSchedule extends DefaultSession {
    HashMap insertInterviewSchedule(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectInterviewScheduleList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectInterviewScheduleDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateInterviewSchedule(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteInterviewSchedule(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
