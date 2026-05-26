package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class KnowledgeArticleBean extends DefaultSession {
    private final KnowledgeArticleEJBDAO knowledgeArticleEJBDAO = new KnowledgeArticleEJBDAO();
    public HashMap insertKnowledgeArticle(DefaultParameters param) throws DefaultEJBException {
        return knowledgeArticleEJBDAO.insertKnowledgeArticle(param);
    }
    public Collection selectKnowledgeArticleList(DefaultParameters param) throws DefaultEJBException {
        return knowledgeArticleEJBDAO.selectKnowledgeArticleList(param);
    }
    public HashMap selectKnowledgeArticleDetail(DefaultParameters param) throws DefaultEJBException {
        return knowledgeArticleEJBDAO.selectKnowledgeArticleDetail(param);
    }
    public HashMap updateKnowledgeArticle(DefaultParameters param) throws DefaultEJBException {
        return knowledgeArticleEJBDAO.updateKnowledgeArticle(param);
    }
    public HashMap deleteKnowledgeArticle(DefaultParameters param) throws DefaultEJBException {
        return knowledgeArticleEJBDAO.deleteKnowledgeArticle(param);
    }
}