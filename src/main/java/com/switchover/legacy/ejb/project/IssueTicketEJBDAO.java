package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class IssueTicketEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/project/007_issueticket/IssueTicket_SQL.xml";
    public HashMap insertIssueTicket(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IssueTicketEJBDAO.InsertIssueTicket", param);
    }
    public Collection selectIssueTicketList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "IssueTicketEJBDAO.SelectIssueTicketList", param);
    }
    public HashMap selectIssueTicketDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IssueTicketEJBDAO.SelectIssueTicketDetail", param);
    }
    public HashMap updateIssueTicket(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IssueTicketEJBDAO.UpdateIssueTicket", param);
    }
    public HashMap deleteIssueTicket(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "IssueTicketEJBDAO.DeleteIssueTicket", param);
    }
}