package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface BudgetPlanLocal extends EJBLocalObject {
    HashMap insertBudgetPlan(DefaultParameters param) throws DefaultEJBException;
    Collection selectBudgetPlanList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectBudgetPlanDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateBudgetPlan(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteBudgetPlan(DefaultParameters param) throws DefaultEJBException;
}