package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface IssueTicketLocal extends EJBLocalObject {
    HashMap insertIssueTicket(DefaultParameters param) throws DefaultEJBException;
    Collection selectIssueTicketList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectIssueTicketDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateIssueTicket(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteIssueTicket(DefaultParameters param) throws DefaultEJBException;
}