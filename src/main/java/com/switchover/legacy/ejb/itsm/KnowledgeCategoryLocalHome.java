package com.switchover.legacy.ejb.itsm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface KnowledgeCategoryLocalHome extends EJBLocalHome {
    KnowledgeCategoryLocal create() throws CreateException;
}