package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface BoardMeeting extends DefaultSession {
    HashMap insertBoardMeeting(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBoardMeetingList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBoardMeetingDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBoardMeeting(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBoardMeeting(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
