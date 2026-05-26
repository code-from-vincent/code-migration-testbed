package com.switchover.legacy.ejb.document;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface DocumentApprovalLocalHome extends EJBLocalHome {
    DocumentApprovalLocal create() throws CreateException;
}