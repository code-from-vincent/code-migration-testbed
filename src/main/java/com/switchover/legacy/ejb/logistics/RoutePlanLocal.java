package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface RoutePlanLocal extends EJBLocalObject {
    HashMap insertRoutePlan(DefaultParameters param) throws DefaultEJBException;
    Collection selectRoutePlanList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectRoutePlanDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateRoutePlan(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteRoutePlan(DefaultParameters param) throws DefaultEJBException;
}