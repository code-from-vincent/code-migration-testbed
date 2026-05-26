package com.switchover.legacy.ejb.report;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ReportExecution extends EJBObject {
    HashMap insertReportExecution(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectReportExecutionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectReportExecutionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateReportExecution(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteReportExecution(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
