package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface EmployeeProfile extends DefaultSession {
    HashMap insertEmployeeProfile(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectEmployeeProfileList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectEmployeeProfileDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateEmployeeProfile(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteEmployeeProfile(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
