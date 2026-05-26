package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SmsQueueLocal extends EJBLocalObject {
    HashMap insertSmsQueue(DefaultParameters param) throws DefaultEJBException;
    Collection selectSmsQueueList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSmsQueueDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSmsQueue(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSmsQueue(DefaultParameters param) throws DefaultEJBException;
}