package com.switchover.legacy.ejb.governance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface BoardMeetingHome extends EJBHome {
    BoardMeeting create() throws CreateException, RemoteException;
}