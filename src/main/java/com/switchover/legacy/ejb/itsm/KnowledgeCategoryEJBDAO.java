package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class KnowledgeCategoryEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/itsm/167_knowledgecategory/KnowledgeCategory_SQL.xml";
    public HashMap insertKnowledgeCategory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KnowledgeCategoryEJBDAO.InsertKnowledgeCategory", param);
    }
    public Collection selectKnowledgeCategoryList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "KnowledgeCategoryEJBDAO.SelectKnowledgeCategoryList", param);
    }
    public HashMap selectKnowledgeCategoryDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KnowledgeCategoryEJBDAO.SelectKnowledgeCategoryDetail", param);
    }
    public HashMap updateKnowledgeCategory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KnowledgeCategoryEJBDAO.UpdateKnowledgeCategory", param);
    }
    public HashMap deleteKnowledgeCategory(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KnowledgeCategoryEJBDAO.DeleteKnowledgeCategory", param);
    }
}