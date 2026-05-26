package com.switchover.legacy.ejb.governance;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
public interface BoardMeetingLocalHome extends EJBLocalHome {
    BoardMeetingLocal create() throws CreateException;
}