package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class BoardMeetingBean extends DefaultSession {
    private final BoardMeetingEJBDAO boardMeetingEJBDAO = new BoardMeetingEJBDAO();
    public HashMap insertBoardMeeting(DefaultParameters param) throws DefaultEJBException {
        return boardMeetingEJBDAO.insertBoardMeeting(param);
    }
    public Collection selectBoardMeetingList(DefaultParameters param) throws DefaultEJBException {
        return boardMeetingEJBDAO.selectBoardMeetingList(param);
    }
    public HashMap selectBoardMeetingDetail(DefaultParameters param) throws DefaultEJBException {
        return boardMeetingEJBDAO.selectBoardMeetingDetail(param);
    }
    public HashMap updateBoardMeeting(DefaultParameters param) throws DefaultEJBException {
        return boardMeetingEJBDAO.updateBoardMeeting(param);
    }
    public HashMap deleteBoardMeeting(DefaultParameters param) throws DefaultEJBException {
        return boardMeetingEJBDAO.deleteBoardMeeting(param);
    }
}