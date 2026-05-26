package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class ActionItemEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/project/190_actionitem/ActionItem_SQL.xml";
    public HashMap insertActionItem(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ActionItemEJBDAO.InsertActionItem", param);
    }
    public Collection selectActionItemList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "ActionItemEJBDAO.SelectActionItemList", param);
    }
    public HashMap selectActionItemDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ActionItemEJBDAO.SelectActionItemDetail", param);
    }
    public HashMap updateActionItem(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ActionItemEJBDAO.UpdateActionItem", param);
    }
    public HashMap deleteActionItem(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "ActionItemEJBDAO.DeleteActionItem", param);
    }
}