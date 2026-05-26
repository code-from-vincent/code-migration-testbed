package com.switchover.legacy.ejb.itsm;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SupportRequestLocal extends EJBLocalObject {
    HashMap insertSupportRequest(DefaultParameters param) throws DefaultEJBException;
    Collection selectSupportRequestList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSupportRequestDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSupportRequest(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSupportRequest(DefaultParameters param) throws DefaultEJBException;
}