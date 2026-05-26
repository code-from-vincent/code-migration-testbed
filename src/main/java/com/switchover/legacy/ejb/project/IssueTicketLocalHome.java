package com.switchover.legacy.ejb.project;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface IssueTicketLocalHome extends EJBLocalHome {
    IssueTicketLocal create() throws CreateException;
}