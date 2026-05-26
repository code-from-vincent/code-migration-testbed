package com.switchover.legacy.ejb.document;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface AnnouncementLocalHome extends EJBLocalHome {
    AnnouncementLocal create() throws CreateException;
}