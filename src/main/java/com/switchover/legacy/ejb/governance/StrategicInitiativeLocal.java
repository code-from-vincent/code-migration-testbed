package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface StrategicInitiativeLocal extends EJBLocalObject {
    HashMap insertStrategicInitiative(DefaultParameters param) throws DefaultEJBException;
    Collection selectStrategicInitiativeList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectStrategicInitiativeDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateStrategicInitiative(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteStrategicInitiative(DefaultParameters param) throws DefaultEJBException;
}