package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PreventiveActionLocal extends EJBLocalObject {
    HashMap insertPreventiveAction(DefaultParameters param) throws DefaultEJBException;
    Collection selectPreventiveActionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPreventiveActionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePreventiveAction(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePreventiveAction(DefaultParameters param) throws DefaultEJBException;
}