package com.switchover.legacy.ejb.security;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PasswordPolicyLocal extends EJBLocalObject {
    HashMap insertPasswordPolicy(DefaultParameters param) throws DefaultEJBException;
    Collection selectPasswordPolicyList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPasswordPolicyDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePasswordPolicy(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePasswordPolicy(DefaultParameters param) throws DefaultEJBException;
}