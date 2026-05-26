package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class JournalEntryBean extends DefaultSession {
    private final JournalEntryEJBDAO journalEntryEJBDAO = new JournalEntryEJBDAO();
    public HashMap insertJournalEntry(DefaultParameters param) throws DefaultEJBException {
        return journalEntryEJBDAO.insertJournalEntry(param);
    }
    public Collection selectJournalEntryList(DefaultParameters param) throws DefaultEJBException {
        return journalEntryEJBDAO.selectJournalEntryList(param);
    }
    public HashMap selectJournalEntryDetail(DefaultParameters param) throws DefaultEJBException {
        return journalEntryEJBDAO.selectJournalEntryDetail(param);
    }
    public HashMap updateJournalEntry(DefaultParameters param) throws DefaultEJBException {
        return journalEntryEJBDAO.updateJournalEntry(param);
    }
    public HashMap deleteJournalEntry(DefaultParameters param) throws DefaultEJBException {
        return journalEntryEJBDAO.deleteJournalEntry(param);
    }
}