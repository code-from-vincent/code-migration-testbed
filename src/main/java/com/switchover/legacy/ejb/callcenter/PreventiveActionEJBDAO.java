package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class PreventiveActionEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/callcenter/146_preventiveaction/PreventiveAction_SQL.xml";
    public HashMap insertPreventiveAction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PreventiveActionEJBDAO.InsertPreventiveAction", param);
    }
    public Collection selectPreventiveActionList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "PreventiveActionEJBDAO.SelectPreventiveActionList", param);
    }
    public HashMap selectPreventiveActionDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PreventiveActionEJBDAO.SelectPreventiveActionDetail", param);
    }
    public HashMap updatePreventiveAction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PreventiveActionEJBDAO.UpdatePreventiveAction", param);
    }
    public HashMap deletePreventiveAction(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "PreventiveActionEJBDAO.DeletePreventiveAction", param);
    }
}