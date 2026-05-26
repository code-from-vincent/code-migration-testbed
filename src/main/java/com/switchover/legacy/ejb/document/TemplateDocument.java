package com.switchover.legacy.ejb.document;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface TemplateDocument extends EJBObject {
    HashMap insertTemplateDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTemplateDocumentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTemplateDocumentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTemplateDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTemplateDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
