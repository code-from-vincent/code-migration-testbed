package com.switchover.legacy.ejb.document;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface ArchiveRecordLocalHome extends EJBLocalHome {
    ArchiveRecordLocal create() throws CreateException;
}