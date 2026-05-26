package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface DataBreachReport extends DefaultSession {
    HashMap insertDataBreachReport(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDataBreachReportList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDataBreachReportDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDataBreachReport(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDataBreachReport(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
