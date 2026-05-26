package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ArchiveRecordBean extends DefaultSession {
    private final ArchiveRecordEJBDAO archiveRecordEJBDAO = new ArchiveRecordEJBDAO();
    public HashMap insertArchiveRecord(DefaultParameters param) throws DefaultEJBException {
        return archiveRecordEJBDAO.insertArchiveRecord(param);
    }
    public Collection selectArchiveRecordList(DefaultParameters param) throws DefaultEJBException {
        return archiveRecordEJBDAO.selectArchiveRecordList(param);
    }
    public HashMap selectArchiveRecordDetail(DefaultParameters param) throws DefaultEJBException {
        return archiveRecordEJBDAO.selectArchiveRecordDetail(param);
    }
    public HashMap updateArchiveRecord(DefaultParameters param) throws DefaultEJBException {
        return archiveRecordEJBDAO.updateArchiveRecord(param);
    }
    public HashMap deleteArchiveRecord(DefaultParameters param) throws DefaultEJBException {
        return archiveRecordEJBDAO.deleteArchiveRecord(param);
    }
}