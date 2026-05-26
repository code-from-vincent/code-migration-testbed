package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ComplianceCheck extends DefaultSession {
    HashMap insertComplianceCheck(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectComplianceCheckList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectComplianceCheckDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateComplianceCheck(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteComplianceCheck(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
