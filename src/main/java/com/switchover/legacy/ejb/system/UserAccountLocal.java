package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface UserAccountLocal extends EJBLocalObject {
    HashMap insertUserAccount(DefaultParameters param) throws DefaultEJBException;
    Collection selectUserAccountList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectUserAccountDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateUserAccount(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteUserAccount(DefaultParameters param) throws DefaultEJBException;
}