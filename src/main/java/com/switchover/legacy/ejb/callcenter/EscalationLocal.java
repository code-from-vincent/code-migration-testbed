package com.switchover.legacy.ejb.callcenter;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface EscalationLocal extends EJBLocalObject {
    HashMap insertEscalation(DefaultParameters param) throws DefaultEJBException;
    Collection selectEscalationList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectEscalationDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateEscalation(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteEscalation(DefaultParameters param) throws DefaultEJBException;
}