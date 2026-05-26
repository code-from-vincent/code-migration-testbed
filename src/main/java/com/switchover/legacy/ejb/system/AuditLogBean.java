package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class AuditLogBean extends DefaultSession {
    private final AuditLogEJBDAO auditLogEJBDAO = new AuditLogEJBDAO();
    public HashMap insertAuditLog(DefaultParameters param) throws DefaultEJBException {
        return auditLogEJBDAO.insertAuditLog(param);
    }
    public Collection selectAuditLogList(DefaultParameters param) throws DefaultEJBException {
        return auditLogEJBDAO.selectAuditLogList(param);
    }
    public HashMap selectAuditLogDetail(DefaultParameters param) throws DefaultEJBException {
        return auditLogEJBDAO.selectAuditLogDetail(param);
    }
    public HashMap updateAuditLog(DefaultParameters param) throws DefaultEJBException {
        return auditLogEJBDAO.updateAuditLog(param);
    }
    public HashMap deleteAuditLog(DefaultParameters param) throws DefaultEJBException {
        return auditLogEJBDAO.deleteAuditLog(param);
    }
}