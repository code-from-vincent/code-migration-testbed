package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Dashboard extends DefaultSession {
    HashMap insertDashboard(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDashboardList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDashboardDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDashboard(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDashboard(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
