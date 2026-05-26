package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface KnowledgeArticle extends DefaultSession {
    HashMap insertKnowledgeArticle(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectKnowledgeArticleList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectKnowledgeArticleDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateKnowledgeArticle(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteKnowledgeArticle(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
