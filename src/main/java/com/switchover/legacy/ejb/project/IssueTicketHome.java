package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface IssueTicketHome extends EJBHome {
    IssueTicket create() throws CreateException, RemoteException;
}