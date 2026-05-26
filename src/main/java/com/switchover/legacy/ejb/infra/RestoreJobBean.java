package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class RestoreJobBean extends DefaultSession {
    private final RestoreJobEJBDAO restoreJobEJBDAO = new RestoreJobEJBDAO();
    public HashMap insertRestoreJob(DefaultParameters param) throws DefaultEJBException {
        return restoreJobEJBDAO.insertRestoreJob(param);
    }
    public Collection selectRestoreJobList(DefaultParameters param) throws DefaultEJBException {
        return restoreJobEJBDAO.selectRestoreJobList(param);
    }
    public HashMap selectRestoreJobDetail(DefaultParameters param) throws DefaultEJBException {
        return restoreJobEJBDAO.selectRestoreJobDetail(param);
    }
    public HashMap updateRestoreJob(DefaultParameters param) throws DefaultEJBException {
        return restoreJobEJBDAO.updateRestoreJob(param);
    }
    public HashMap deleteRestoreJob(DefaultParameters param) throws DefaultEJBException {
        return restoreJobEJBDAO.deleteRestoreJob(param);
    }
}