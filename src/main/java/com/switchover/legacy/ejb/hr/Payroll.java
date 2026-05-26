package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Payroll extends EJBObject {
    HashMap insertPayroll(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPayrollList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPayrollDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePayroll(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePayroll(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
