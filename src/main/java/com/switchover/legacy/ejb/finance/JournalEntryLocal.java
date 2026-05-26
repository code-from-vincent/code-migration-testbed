package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface JournalEntryLocal extends EJBLocalObject {
    HashMap insertJournalEntry(DefaultParameters param) throws DefaultEJBException;
    Collection selectJournalEntryList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectJournalEntryDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateJournalEntry(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteJournalEntry(DefaultParameters param) throws DefaultEJBException;
}