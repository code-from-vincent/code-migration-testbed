package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface TemplateDocument extends DefaultSession {
    HashMap insertTemplateDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTemplateDocumentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTemplateDocumentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTemplateDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTemplateDocument(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
