package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;
public interface IssueTicket extends EJBObject {
    HashMap insertIssueTicket(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectIssueTicketList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectIssueTicketDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateIssueTicket(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteIssueTicket(DefaultParameters param) throws RemoteException, DefaultEJBException;
}