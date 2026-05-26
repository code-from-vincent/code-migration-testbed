package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PasswordPolicy extends DefaultSession {
    HashMap insertPasswordPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPasswordPolicyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPasswordPolicyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePasswordPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePasswordPolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
