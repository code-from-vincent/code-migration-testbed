package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class AuditLogEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/system/010_auditlog/AuditLog_SQL.xml";
    public HashMap insertAuditLog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AuditLogEJBDAO.InsertAuditLog", param);
    }
    public Collection selectAuditLogList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "AuditLogEJBDAO.SelectAuditLogList", param);
    }
    public HashMap selectAuditLogDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AuditLogEJBDAO.SelectAuditLogDetail", param);
    }
    public HashMap updateAuditLog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AuditLogEJBDAO.UpdateAuditLog", param);
    }
    public HashMap deleteAuditLog(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "AuditLogEJBDAO.DeleteAuditLog", param);
    }
}