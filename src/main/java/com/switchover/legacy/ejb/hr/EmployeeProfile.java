package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface EmployeeProfile extends EJBObject {
    HashMap insertEmployeeProfile(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectEmployeeProfileList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectEmployeeProfileDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateEmployeeProfile(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteEmployeeProfile(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
