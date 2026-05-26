package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CorrectiveActionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/callcenter/145_correctiveaction/CorrectiveAction_SQL.xml";
    public HashMap insertCorrectiveAction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CorrectiveActionEJBDAO.InsertCorrectiveAction", param);
    }
    public Collection selectCorrectiveActionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CorrectiveActionEJBDAO.SelectCorrectiveActionList", param);
    }
    public HashMap selectCorrectiveActionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CorrectiveActionEJBDAO.SelectCorrectiveActionDetail", param);
    }
    public HashMap updateCorrectiveAction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CorrectiveActionEJBDAO.UpdateCorrectiveAction", param);
    }
    public HashMap deleteCorrectiveAction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CorrectiveActionEJBDAO.DeleteCorrectiveAction", param);
    }
}