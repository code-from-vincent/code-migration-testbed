package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface EmailQueueLocal extends EJBLocalObject {
    HashMap insertEmailQueue(DefaultParameters param) throws DefaultEJBException;
    Collection selectEmailQueueList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectEmailQueueDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateEmailQueue(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteEmailQueue(DefaultParameters param) throws DefaultEJBException;
}