package com.switchover.legacy.ejb.document;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface FaqLocalHome extends EJBLocalHome {
    FaqLocal create() throws CreateException;
}