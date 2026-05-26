package com.switchover.legacy.ejb.document;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface RetentionPolicyLocalHome extends EJBLocalHome {
    RetentionPolicyLocal create() throws CreateException;
}