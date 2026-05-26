package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ExpenseReport extends EJBObject {
    HashMap insertExpenseReport(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectExpenseReportList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectExpenseReportDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateExpenseReport(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteExpenseReport(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
