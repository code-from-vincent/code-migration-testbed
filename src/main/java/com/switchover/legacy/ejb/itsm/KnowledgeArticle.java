package com.switchover.legacy.ejb.itsm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface KnowledgeArticle extends EJBObject {
    HashMap insertKnowledgeArticle(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectKnowledgeArticleList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectKnowledgeArticleDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateKnowledgeArticle(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteKnowledgeArticle(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
