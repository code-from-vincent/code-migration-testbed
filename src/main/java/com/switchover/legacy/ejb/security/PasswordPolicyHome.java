package com.switchover.legacy.ejb.security;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface PasswordPolicyHome extends EJBHome {
    PasswordPolicy create() throws CreateException, RemoteException;
}