package com.switchover.legacy.ejb.infra;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DisasterRecoveryPlanBean extends DefaultSession {
    private final DisasterRecoveryPlanEJBDAO disasterRecoveryPlanEJBDAO = new DisasterRecoveryPlanEJBDAO();
    public HashMap insertDisasterRecoveryPlan(DefaultParameters param) throws DefaultEJBException {
        return disasterRecoveryPlanEJBDAO.insertDisasterRecoveryPlan(param);
    }
    public Collection selectDisasterRecoveryPlanList(DefaultParameters param) throws DefaultEJBException {
        return disasterRecoveryPlanEJBDAO.selectDisasterRecoveryPlanList(param);
    }
    public HashMap selectDisasterRecoveryPlanDetail(DefaultParameters param) throws DefaultEJBException {
        return disasterRecoveryPlanEJBDAO.selectDisasterRecoveryPlanDetail(param);
    }
    public HashMap updateDisasterRecoveryPlan(DefaultParameters param) throws DefaultEJBException {
        return disasterRecoveryPlanEJBDAO.updateDisasterRecoveryPlan(param);
    }
    public HashMap deleteDisasterRecoveryPlan(DefaultParameters param) throws DefaultEJBException {
        return disasterRecoveryPlanEJBDAO.deleteDisasterRecoveryPlan(param);
    }
}