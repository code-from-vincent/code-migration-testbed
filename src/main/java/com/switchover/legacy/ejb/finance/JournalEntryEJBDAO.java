package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class JournalEntryEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/finance/113_journalentry/JournalEntry_SQL.xml";
    public HashMap insertJournalEntry(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "JournalEntryEJBDAO.InsertJournalEntry", param);
    }
    public Collection selectJournalEntryList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "JournalEntryEJBDAO.SelectJournalEntryList", param);
    }
    public HashMap selectJournalEntryDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "JournalEntryEJBDAO.SelectJournalEntryDetail", param);
    }
    public HashMap updateJournalEntry(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "JournalEntryEJBDAO.UpdateJournalEntry", param);
    }
    public HashMap deleteJournalEntry(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "JournalEntryEJBDAO.DeleteJournalEntry", param);
    }
}