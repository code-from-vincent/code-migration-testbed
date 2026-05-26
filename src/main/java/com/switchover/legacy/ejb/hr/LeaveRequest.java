package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface LeaveRequest extends EJBObject {
    HashMap insertLeaveRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectLeaveRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectLeaveRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateLeaveRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteLeaveRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
