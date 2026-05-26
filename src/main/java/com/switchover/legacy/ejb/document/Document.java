package com.switchover.legacy.ejb.document;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;
public interface Document extends EJBObject {
    HashMap insertDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDocumentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDocumentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
}