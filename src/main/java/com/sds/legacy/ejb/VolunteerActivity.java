package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface VolunteerActivity extends DefaultSession {
    HashMap insertVolunteerActivity(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectVolunteerActivityList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectVolunteerActivityDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateVolunteerActivity(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteVolunteerActivity(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
