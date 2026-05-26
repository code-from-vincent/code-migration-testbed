package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class BackupJobEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/infra/157_backupjob/BackupJob_SQL.xml";
    public HashMap insertBackupJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BackupJobEJBDAO.InsertBackupJob", param);
    }
    public Collection selectBackupJobList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "BackupJobEJBDAO.SelectBackupJobList", param);
    }
    public HashMap selectBackupJobDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BackupJobEJBDAO.SelectBackupJobDetail", param);
    }
    public HashMap updateBackupJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BackupJobEJBDAO.UpdateBackupJob", param);
    }
    public HashMap deleteBackupJob(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BackupJobEJBDAO.DeleteBackupJob", param);
    }
}