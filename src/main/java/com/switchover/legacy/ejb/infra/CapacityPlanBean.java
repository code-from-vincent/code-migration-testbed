package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class CapacityPlanBean extends DefaultSession {
    private final CapacityPlanEJBDAO capacityPlanEJBDAO = new CapacityPlanEJBDAO();
    public HashMap insertCapacityPlan(DefaultParameters param) throws DefaultEJBException {
        return capacityPlanEJBDAO.insertCapacityPlan(param);
    }
    public Collection selectCapacityPlanList(DefaultParameters param) throws DefaultEJBException {
        return capacityPlanEJBDAO.selectCapacityPlanList(param);
    }
    public HashMap selectCapacityPlanDetail(DefaultParameters param) throws DefaultEJBException {
        return capacityPlanEJBDAO.selectCapacityPlanDetail(param);
    }
    public HashMap updateCapacityPlan(DefaultParameters param) throws DefaultEJBException {
        return capacityPlanEJBDAO.updateCapacityPlan(param);
    }
    public HashMap deleteCapacityPlan(DefaultParameters param) throws DefaultEJBException {
        return capacityPlanEJBDAO.deleteCapacityPlan(param);
    }
}