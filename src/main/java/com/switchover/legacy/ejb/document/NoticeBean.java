package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class NoticeBean extends DefaultSession {
    private final NoticeEJBDAO noticeEJBDAO = new NoticeEJBDAO();
    public HashMap insertNotice(DefaultParameters param) throws DefaultEJBException {
        return noticeEJBDAO.insertNotice(param);
    }
    public Collection selectNoticeList(DefaultParameters param) throws DefaultEJBException {
        return noticeEJBDAO.selectNoticeList(param);
    }
    public HashMap selectNoticeDetail(DefaultParameters param) throws DefaultEJBException {
        return noticeEJBDAO.selectNoticeDetail(param);
    }
    public HashMap updateNotice(DefaultParameters param) throws DefaultEJBException {
        return noticeEJBDAO.updateNotice(param);
    }
    public HashMap deleteNotice(DefaultParameters param) throws DefaultEJBException {
        return noticeEJBDAO.deleteNotice(param);
    }
}