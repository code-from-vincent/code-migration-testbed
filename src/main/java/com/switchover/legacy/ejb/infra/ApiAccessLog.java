package com.switchover.legacy.ejb.infra;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ApiAccessLog extends EJBObject {
    HashMap insertApiAccessLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectApiAccessLogList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectApiAccessLogDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateApiAccessLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteApiAccessLog(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
