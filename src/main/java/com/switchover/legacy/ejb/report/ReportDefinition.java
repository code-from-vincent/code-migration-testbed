package com.switchover.legacy.ejb.report;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ReportDefinition extends EJBObject {
    HashMap insertReportDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectReportDefinitionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectReportDefinitionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateReportDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteReportDefinition(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
