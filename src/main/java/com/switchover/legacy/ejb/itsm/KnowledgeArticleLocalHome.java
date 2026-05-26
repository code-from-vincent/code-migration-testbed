package com.switchover.legacy.ejb.itsm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface KnowledgeArticleLocalHome extends EJBLocalHome {
    KnowledgeArticleLocal create() throws CreateException;
}