package com.switchover.legacy.ejb.system;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface AccessPolicyLocal extends EJBLocalObject {
    HashMap insertAccessPolicy(DefaultParameters param) throws DefaultEJBException;
    Collection selectAccessPolicyList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectAccessPolicyDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateAccessPolicy(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteAccessPolicy(DefaultParameters param) throws DefaultEJBException;
}