package com.switchover.legacy.ejb.report;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Dashboard extends EJBObject {
    HashMap insertDashboard(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDashboardList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDashboardDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDashboard(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDashboard(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
