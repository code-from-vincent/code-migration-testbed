package com.switchover.legacy.ejb.privacy;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PrivacyRequestLocal extends EJBLocalObject {
    HashMap insertPrivacyRequest(DefaultParameters param) throws DefaultEJBException;
    Collection selectPrivacyRequestList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPrivacyRequestDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePrivacyRequest(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePrivacyRequest(DefaultParameters param) throws DefaultEJBException;
}