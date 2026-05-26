package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBDAO;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public class BoardMeetingEJBDAO extends DefaultEJBDAO {
    private static final String QUERY_XML_PATH = "xml_query/governance/181_boardmeeting/BoardMeeting_SQL.xml";
    public HashMap insertBoardMeeting(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BoardMeetingEJBDAO.InsertBoardMeeting", param);
    }
    public Collection selectBoardMeetingList(DefaultParameters param) throws DefaultEJBException {
        return executeCollectionQuery(QUERY_XML_PATH, "BoardMeetingEJBDAO.SelectBoardMeetingList", param);
    }
    public HashMap selectBoardMeetingDetail(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BoardMeetingEJBDAO.SelectBoardMeetingDetail", param);
    }
    public HashMap updateBoardMeeting(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BoardMeetingEJBDAO.UpdateBoardMeeting", param);
    }
    public HashMap deleteBoardMeeting(DefaultParameters param) throws DefaultEJBException {
        return executeHashMapQuery(QUERY_XML_PATH, "BoardMeetingEJBDAO.DeleteBoardMeeting", param);
    }
}