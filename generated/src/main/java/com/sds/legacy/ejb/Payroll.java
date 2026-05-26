package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Payroll extends DefaultSession {
    HashMap insertPayroll(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPayrollList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPayrollDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePayroll(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePayroll(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
