package com.switchover.legacy.ejb.itsm;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface CmdbRelationshipLocalHome extends EJBLocalHome {
    CmdbRelationshipLocal create() throws CreateException;
}