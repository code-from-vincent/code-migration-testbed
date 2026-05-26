package com.switchover.legacy.ejb.csr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface VolunteerActivity extends EJBObject {
    HashMap insertVolunteerActivity(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectVolunteerActivityList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectVolunteerActivityDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateVolunteerActivity(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteVolunteerActivity(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
