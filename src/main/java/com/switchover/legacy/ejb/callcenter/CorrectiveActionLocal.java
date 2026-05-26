package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CorrectiveActionLocal extends EJBLocalObject {
    HashMap insertCorrectiveAction(DefaultParameters param) throws DefaultEJBException;
    Collection selectCorrectiveActionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCorrectiveActionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCorrectiveAction(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCorrectiveAction(DefaultParameters param) throws DefaultEJBException;
}