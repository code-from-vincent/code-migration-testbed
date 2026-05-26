package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface BoardMeetingLocal extends EJBLocalObject {
    HashMap insertBoardMeeting(DefaultParameters param) throws DefaultEJBException;
    Collection selectBoardMeetingList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectBoardMeetingDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateBoardMeeting(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteBoardMeeting(DefaultParameters param) throws DefaultEJBException;
}