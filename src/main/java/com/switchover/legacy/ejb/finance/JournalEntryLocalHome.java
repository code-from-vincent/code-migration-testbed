package com.switchover.legacy.ejb.finance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface JournalEntryLocalHome extends EJBLocalHome {
    JournalEntryLocal create() throws CreateException;
}