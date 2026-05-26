package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface RestoreJobLocal extends EJBLocalObject {
    HashMap insertRestoreJob(DefaultParameters param) throws DefaultEJBException;
    Collection selectRestoreJobList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectRestoreJobDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateRestoreJob(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteRestoreJob(DefaultParameters param) throws DefaultEJBException;
}