package com.switchover.legacy.ejb.finance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface YearEndClosingHome extends EJBHome {
    YearEndClosing create() throws CreateException, RemoteException;
}