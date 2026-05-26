package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ProductionPlanLocal extends EJBLocalObject {
    HashMap insertProductionPlan(DefaultParameters param) throws DefaultEJBException;
    Collection selectProductionPlanList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectProductionPlanDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateProductionPlan(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteProductionPlan(DefaultParameters param) throws DefaultEJBException;
}