package com.switchover.legacy.ejb.document;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface TemplateDocumentLocalHome extends EJBLocalHome {
    TemplateDocumentLocal create() throws CreateException;
}