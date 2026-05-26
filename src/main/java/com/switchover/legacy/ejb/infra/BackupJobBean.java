package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class BackupJobBean extends DefaultSession {
    private final BackupJobEJBDAO backupJobEJBDAO = new BackupJobEJBDAO();
    public HashMap insertBackupJob(DefaultParameters param) throws DefaultEJBException {
        return backupJobEJBDAO.insertBackupJob(param);
    }
    public Collection selectBackupJobList(DefaultParameters param) throws DefaultEJBException {
        return backupJobEJBDAO.selectBackupJobList(param);
    }
    public HashMap selectBackupJobDetail(DefaultParameters param) throws DefaultEJBException {
        return backupJobEJBDAO.selectBackupJobDetail(param);
    }
    public HashMap updateBackupJob(DefaultParameters param) throws DefaultEJBException {
        return backupJobEJBDAO.updateBackupJob(param);
    }
    public HashMap deleteBackupJob(DefaultParameters param) throws DefaultEJBException {
        return backupJobEJBDAO.deleteBackupJob(param);
    }
}