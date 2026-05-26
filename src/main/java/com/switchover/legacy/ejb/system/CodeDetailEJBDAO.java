package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class CodeDetailEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/system/014_codedetail/CodeDetail_SQL.xml";
    public HashMap insertCodeDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CodeDetailEJBDAO.InsertCodeDetail", param);
    }
    public Collection selectCodeDetailList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "CodeDetailEJBDAO.SelectCodeDetailList", param);
    }
    public HashMap selectCodeDetailDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CodeDetailEJBDAO.SelectCodeDetailDetail", param);
    }
    public HashMap updateCodeDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CodeDetailEJBDAO.UpdateCodeDetail", param);
    }
    public HashMap deleteCodeDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "CodeDetailEJBDAO.DeleteCodeDetail", param);
    }
}