package com.switchover.legacy.ejb.notification;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class EmailQueueBean extends DefaultSession {
    private final EmailQueueEJBDAO emailQueueEJBDAO = new EmailQueueEJBDAO();
    public HashMap insertEmailQueue(DefaultParameters param) throws DefaultEJBException {
        return emailQueueEJBDAO.insertEmailQueue(param);
    }
    public Collection selectEmailQueueList(DefaultParameters param) throws DefaultEJBException {
        return emailQueueEJBDAO.selectEmailQueueList(param);
    }
    public HashMap selectEmailQueueDetail(DefaultParameters param) throws DefaultEJBException {
        return emailQueueEJBDAO.selectEmailQueueDetail(param);
    }
    public HashMap updateEmailQueue(DefaultParameters param) throws DefaultEJBException {
        return emailQueueEJBDAO.updateEmailQueue(param);
    }
    public HashMap deleteEmailQueue(DefaultParameters param) throws DefaultEJBException {
        return emailQueueEJBDAO.deleteEmailQueue(param);
    }
}