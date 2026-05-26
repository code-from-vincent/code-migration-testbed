package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ArchiveRecordLocal extends EJBLocalObject {
    HashMap insertArchiveRecord(DefaultParameters param) throws DefaultEJBException;
    Collection selectArchiveRecordList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectArchiveRecordDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateArchiveRecord(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteArchiveRecord(DefaultParameters param) throws DefaultEJBException;
}