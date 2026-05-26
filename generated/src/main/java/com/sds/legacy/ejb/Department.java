package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Department extends DefaultSession {
    HashMap insertDepartment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDepartmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDepartmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDepartment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDepartment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
