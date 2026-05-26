package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class FaqEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/document/009_faq/Faq_SQL.xml";
    public HashMap insertFaq(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FaqEJBDAO.InsertFaq", param);
    }
    public Collection selectFaqList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "FaqEJBDAO.SelectFaqList", param);
    }
    public HashMap selectFaqDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FaqEJBDAO.SelectFaqDetail", param);
    }
    public HashMap updateFaq(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FaqEJBDAO.UpdateFaq", param);
    }
    public HashMap deleteFaq(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "FaqEJBDAO.DeleteFaq", param);
    }
}