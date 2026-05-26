package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface KnowledgeArticleLocal extends EJBLocalObject {
    HashMap insertKnowledgeArticle(DefaultParameters param) throws DefaultEJBException;
    Collection selectKnowledgeArticleList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectKnowledgeArticleDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateKnowledgeArticle(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteKnowledgeArticle(DefaultParameters param) throws DefaultEJBException;
}