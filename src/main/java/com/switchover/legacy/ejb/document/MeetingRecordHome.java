package com.switchover.legacy.ejb.document;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface MeetingRecordHome extends EJBHome {
    MeetingRecord create() throws CreateException, RemoteException;
}