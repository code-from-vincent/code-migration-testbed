package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class RoutePlanBean extends DefaultSession {
    private final RoutePlanEJBDAO routePlanEJBDAO = new RoutePlanEJBDAO();
    public HashMap insertRoutePlan(DefaultParameters param) throws DefaultEJBException {
        return routePlanEJBDAO.insertRoutePlan(param);
    }
    public Collection selectRoutePlanList(DefaultParameters param) throws DefaultEJBException {
        return routePlanEJBDAO.selectRoutePlanList(param);
    }
    public HashMap selectRoutePlanDetail(DefaultParameters param) throws DefaultEJBException {
        return routePlanEJBDAO.selectRoutePlanDetail(param);
    }
    public HashMap updateRoutePlan(DefaultParameters param) throws DefaultEJBException {
        return routePlanEJBDAO.updateRoutePlan(param);
    }
    public HashMap deleteRoutePlan(DefaultParameters param) throws DefaultEJBException {
        return routePlanEJBDAO.deleteRoutePlan(param);
    }
}