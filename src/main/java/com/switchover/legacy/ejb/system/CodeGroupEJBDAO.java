package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CodeGroupEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/system/013_codegroup/CodeGroup_SQL.xml";
    public HashMap insertCodeGroup(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CodeGroupEJBDAO.InsertCodeGroup", param);
    }
    public Collection selectCodeGroupList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CodeGroupEJBDAO.SelectCodeGroupList", param);
    }
    public HashMap selectCodeGroupDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CodeGroupEJBDAO.SelectCodeGroupDetail", param);
    }
    public HashMap updateCodeGroup(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CodeGroupEJBDAO.UpdateCodeGroup", param);
    }
    public HashMap deleteCodeGroup(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CodeGroupEJBDAO.DeleteCodeGroup", param);
    }
}