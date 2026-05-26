package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface KnowledgeCategory extends DefaultSession {
    HashMap insertKnowledgeCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectKnowledgeCategoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectKnowledgeCategoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateKnowledgeCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteKnowledgeCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
