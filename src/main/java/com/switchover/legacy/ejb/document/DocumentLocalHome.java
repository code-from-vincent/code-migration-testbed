package com.switchover.legacy.ejb.document;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DocumentLocalHome extends EJBLocalHome {
    DocumentLocal create() throws CreateException;
}