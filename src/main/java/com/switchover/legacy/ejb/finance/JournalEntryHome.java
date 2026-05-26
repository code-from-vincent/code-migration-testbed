package com.switchover.legacy.ejb.finance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface JournalEntryHome extends EJBHome {
    JournalEntry create() throws CreateException, RemoteException;
}