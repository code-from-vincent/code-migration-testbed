package com.switchover.legacy.ejb.document;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface TemplateDocumentHome extends EJBHome {
    TemplateDocument create() throws CreateException, RemoteException;
}