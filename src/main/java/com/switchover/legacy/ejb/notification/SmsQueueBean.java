package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class SmsQueueBean extends DefaultSession {
    private final SmsQueueEJBDAO smsQueueEJBDAO = new SmsQueueEJBDAO();
    public HashMap insertSmsQueue(DefaultParameters param) throws DefaultEJBException {
        return smsQueueEJBDAO.insertSmsQueue(param);
    }
    public Collection selectSmsQueueList(DefaultParameters param) throws DefaultEJBException {
        return smsQueueEJBDAO.selectSmsQueueList(param);
    }
    public HashMap selectSmsQueueDetail(DefaultParameters param) throws DefaultEJBException {
        return smsQueueEJBDAO.selectSmsQueueDetail(param);
    }
    public HashMap updateSmsQueue(DefaultParameters param) throws DefaultEJBException {
        return smsQueueEJBDAO.updateSmsQueue(param);
    }
    public HashMap deleteSmsQueue(DefaultParameters param) throws DefaultEJBException {
        return smsQueueEJBDAO.deleteSmsQueue(param);
    }
}