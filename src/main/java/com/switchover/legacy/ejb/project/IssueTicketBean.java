package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class IssueTicketBean extends DefaultSession {
    private final IssueTicketEJBDAO issueTicketEJBDAO = new IssueTicketEJBDAO();
    public HashMap insertIssueTicket(DefaultParameters param) throws DefaultEJBException {
        return issueTicketEJBDAO.insertIssueTicket(param);
    }
    public Collection selectIssueTicketList(DefaultParameters param) throws DefaultEJBException {
        return issueTicketEJBDAO.selectIssueTicketList(param);
    }
    public HashMap selectIssueTicketDetail(DefaultParameters param) throws DefaultEJBException {
        return issueTicketEJBDAO.selectIssueTicketDetail(param);
    }
    public HashMap updateIssueTicket(DefaultParameters param) throws DefaultEJBException {
        return issueTicketEJBDAO.updateIssueTicket(param);
    }
    public HashMap deleteIssueTicket(DefaultParameters param) throws DefaultEJBException {
        return issueTicketEJBDAO.deleteIssueTicket(param);
    }
}