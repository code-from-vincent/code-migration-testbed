package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class KnowledgeCategoryBean extends DefaultSession {
    private final KnowledgeCategoryEJBDAO knowledgeCategoryEJBDAO = new KnowledgeCategoryEJBDAO();
    public HashMap insertKnowledgeCategory(DefaultParameters param) throws DefaultEJBException {
        return knowledgeCategoryEJBDAO.insertKnowledgeCategory(param);
    }
    public Collection selectKnowledgeCategoryList(DefaultParameters param) throws DefaultEJBException {
        return knowledgeCategoryEJBDAO.selectKnowledgeCategoryList(param);
    }
    public HashMap selectKnowledgeCategoryDetail(DefaultParameters param) throws DefaultEJBException {
        return knowledgeCategoryEJBDAO.selectKnowledgeCategoryDetail(param);
    }
    public HashMap updateKnowledgeCategory(DefaultParameters param) throws DefaultEJBException {
        return knowledgeCategoryEJBDAO.updateKnowledgeCategory(param);
    }
    public HashMap deleteKnowledgeCategory(DefaultParameters param) throws DefaultEJBException {
        return knowledgeCategoryEJBDAO.deleteKnowledgeCategory(param);
    }
}