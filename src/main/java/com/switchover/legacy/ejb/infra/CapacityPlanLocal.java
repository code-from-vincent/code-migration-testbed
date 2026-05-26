package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CapacityPlanLocal extends EJBLocalObject {
    HashMap insertCapacityPlan(DefaultParameters param) throws DefaultEJBException;
    Collection selectCapacityPlanList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCapacityPlanDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCapacityPlan(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCapacityPlan(DefaultParameters param) throws DefaultEJBException;
}