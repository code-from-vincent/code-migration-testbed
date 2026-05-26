package com.switchover.legacy.ejb.project;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ReleasePlanBean extends DefaultSession {
    private final ReleasePlanEJBDAO releasePlanEJBDAO = new ReleasePlanEJBDAO();
    public HashMap insertReleasePlan(DefaultParameters param) throws DefaultEJBException {
        return releasePlanEJBDAO.insertReleasePlan(param);
    }
    public Collection selectReleasePlanList(DefaultParameters param) throws DefaultEJBException {
        return releasePlanEJBDAO.selectReleasePlanList(param);
    }
    public HashMap selectReleasePlanDetail(DefaultParameters param) throws DefaultEJBException {
        return releasePlanEJBDAO.selectReleasePlanDetail(param);
    }
    public HashMap updateReleasePlan(DefaultParameters param) throws DefaultEJBException {
        return releasePlanEJBDAO.updateReleasePlan(param);
    }
    public HashMap deleteReleasePlan(DefaultParameters param) throws DefaultEJBException {
        return releasePlanEJBDAO.deleteReleasePlan(param);
    }
}