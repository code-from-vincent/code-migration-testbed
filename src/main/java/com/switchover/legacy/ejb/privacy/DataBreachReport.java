package com.switchover.legacy.ejb.privacy;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface DataBreachReport extends EJBObject {
    HashMap insertDataBreachReport(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDataBreachReportList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDataBreachReportDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDataBreachReport(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDataBreachReport(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
