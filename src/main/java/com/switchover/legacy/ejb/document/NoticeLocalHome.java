package com.switchover.legacy.ejb.document;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface NoticeLocalHome extends EJBLocalHome {
    NoticeLocal create() throws CreateException;
}