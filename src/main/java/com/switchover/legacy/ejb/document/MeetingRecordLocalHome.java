package com.switchover.legacy.ejb.document;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface MeetingRecordLocalHome extends EJBLocalHome {
    MeetingRecordLocal create() throws CreateException;
}