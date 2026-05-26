package com.switchover.legacy.ejb.legal;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ComplianceCheck extends EJBObject {
    HashMap insertComplianceCheck(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectComplianceCheckList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectComplianceCheckDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateComplianceCheck(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteComplianceCheck(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
