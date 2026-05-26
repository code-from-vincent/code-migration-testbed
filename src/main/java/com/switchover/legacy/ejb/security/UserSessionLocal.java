package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface UserSessionLocal extends EJBLocalObject {
    HashMap insertUserSession(DefaultParameters param) throws DefaultEJBException;
    Collection selectUserSessionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectUserSessionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateUserSession(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteUserSession(DefaultParameters param) throws DefaultEJBException;
}