package com.switchover.legacy.ejb.itsm;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface KnowledgeCategory extends EJBObject {
    HashMap insertKnowledgeCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectKnowledgeCategoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectKnowledgeCategoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateKnowledgeCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteKnowledgeCategory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
