package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ReportExecution extends DefaultSession {
    HashMap insertReportExecution(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectReportExecutionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectReportExecutionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateReportExecution(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteReportExecution(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
