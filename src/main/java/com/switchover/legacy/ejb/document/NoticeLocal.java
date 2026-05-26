package com.switchover.legacy.ejb.document;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface NoticeLocal extends EJBLocalObject {
    HashMap insertNotice(DefaultParameters param) throws DefaultEJBException;
    Collection selectNoticeList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectNoticeDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateNotice(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteNotice(DefaultParameters param) throws DefaultEJBException;
}