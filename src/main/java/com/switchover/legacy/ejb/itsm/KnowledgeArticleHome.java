package com.switchover.legacy.ejb.itsm;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface KnowledgeArticleHome extends EJBHome {
    KnowledgeArticle create() throws CreateException, RemoteException;
}