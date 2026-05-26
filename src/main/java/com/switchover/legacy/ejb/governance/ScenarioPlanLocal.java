package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ScenarioPlanLocal extends EJBLocalObject {
    HashMap insertScenarioPlan(DefaultParameters param) throws DefaultEJBException;
    Collection selectScenarioPlanList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectScenarioPlanDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateScenarioPlan(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteScenarioPlan(DefaultParameters param) throws DefaultEJBException;
}