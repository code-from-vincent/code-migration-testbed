package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface LoginHistoryLocal extends EJBLocalObject {
    HashMap insertLoginHistory(DefaultParameters param) throws DefaultEJBException;
    Collection selectLoginHistoryList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectLoginHistoryDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateLoginHistory(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteLoginHistory(DefaultParameters param) throws DefaultEJBException;
}