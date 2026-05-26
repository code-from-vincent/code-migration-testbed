package com.switchover.legacy.ejb.callcenter;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Complaint extends EJBObject {
    HashMap insertComplaint(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectComplaintList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectComplaintDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateComplaint(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteComplaint(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
