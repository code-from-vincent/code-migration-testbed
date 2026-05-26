package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class MenuEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/system/012_menu/Menu_SQL.xml";
    public HashMap insertMenu(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MenuEJBDAO.InsertMenu", param);
    }
    public Collection selectMenuList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "MenuEJBDAO.SelectMenuList", param);
    }
    public HashMap selectMenuDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MenuEJBDAO.SelectMenuDetail", param);
    }
    public HashMap updateMenu(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MenuEJBDAO.UpdateMenu", param);
    }
    public HashMap deleteMenu(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "MenuEJBDAO.DeleteMenu", param);
    }
}