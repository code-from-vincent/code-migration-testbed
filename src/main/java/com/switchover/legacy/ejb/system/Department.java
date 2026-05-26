package com.switchover.legacy.ejb.system;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Department extends EJBObject {
    HashMap insertDepartment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDepartmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDepartmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDepartment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDepartment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
