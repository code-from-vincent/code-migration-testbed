package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface BackupJobLocal extends EJBLocalObject {
    HashMap insertBackupJob(DefaultParameters param) throws DefaultEJBException;
    Collection selectBackupJobList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectBackupJobDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateBackupJob(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteBackupJob(DefaultParameters param) throws DefaultEJBException;
}