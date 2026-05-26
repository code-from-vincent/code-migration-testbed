package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface UserRoleLocal extends EJBLocalObject {
    HashMap insertUserRole(DefaultParameters param) throws DefaultEJBException;
    Collection selectUserRoleList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectUserRoleDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateUserRole(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteUserRole(DefaultParameters param) throws DefaultEJBException;
}