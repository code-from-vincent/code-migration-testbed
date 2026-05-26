package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface AuditLogLocal extends EJBLocalObject {
    HashMap insertAuditLog(DefaultParameters param) throws DefaultEJBException;
    Collection selectAuditLogList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectAuditLogDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateAuditLog(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteAuditLog(DefaultParameters param) throws DefaultEJBException;
}