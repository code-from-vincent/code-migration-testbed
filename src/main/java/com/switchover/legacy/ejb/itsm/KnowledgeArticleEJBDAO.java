package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class KnowledgeArticleEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/itsm/066_knowledgearticle/KnowledgeArticle_SQL.xml";
    public HashMap insertKnowledgeArticle(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KnowledgeArticleEJBDAO.InsertKnowledgeArticle", param);
    }
    public Collection selectKnowledgeArticleList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "KnowledgeArticleEJBDAO.SelectKnowledgeArticleList", param);
    }
    public HashMap selectKnowledgeArticleDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KnowledgeArticleEJBDAO.SelectKnowledgeArticleDetail", param);
    }
    public HashMap updateKnowledgeArticle(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KnowledgeArticleEJBDAO.UpdateKnowledgeArticle", param);
    }
    public HashMap deleteKnowledgeArticle(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "KnowledgeArticleEJBDAO.DeleteKnowledgeArticle", param);
    }
}