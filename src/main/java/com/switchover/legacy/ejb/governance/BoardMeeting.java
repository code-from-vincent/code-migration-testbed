package com.switchover.legacy.ejb.governance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface BoardMeeting extends EJBObject {
    HashMap insertBoardMeeting(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBoardMeetingList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBoardMeetingDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBoardMeeting(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBoardMeeting(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
