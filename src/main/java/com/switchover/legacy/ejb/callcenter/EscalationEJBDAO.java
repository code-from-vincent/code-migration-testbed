package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class EscalationEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/callcenter/143_escalation/Escalation_SQL.xml";
    public HashMap insertEscalation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EscalationEJBDAO.InsertEscalation", param);
    }
    public Collection selectEscalationList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "EscalationEJBDAO.SelectEscalationList", param);
    }
    public HashMap selectEscalationDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EscalationEJBDAO.SelectEscalationDetail", param);
    }
    public HashMap updateEscalation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EscalationEJBDAO.UpdateEscalation", param);
    }
    public HashMap deleteEscalation(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "EscalationEJBDAO.DeleteEscalation", param);
    }
}