package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DisasterRecoveryPlanLocal extends EJBLocalObject {
    HashMap insertDisasterRecoveryPlan(DefaultParameters param) throws DefaultEJBException;
    Collection selectDisasterRecoveryPlanList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDisasterRecoveryPlanDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDisasterRecoveryPlan(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDisasterRecoveryPlan(DefaultParameters param) throws DefaultEJBException;
}