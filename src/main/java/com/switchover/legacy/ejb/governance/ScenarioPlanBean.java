package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ScenarioPlanBean extends DefaultSession {
    private final ScenarioPlanEJBDAO scenarioPlanEJBDAO = new ScenarioPlanEJBDAO();
    public HashMap insertScenarioPlan(DefaultParameters param) throws DefaultEJBException {
        return scenarioPlanEJBDAO.insertScenarioPlan(param);
    }
    public Collection selectScenarioPlanList(DefaultParameters param) throws DefaultEJBException {
        return scenarioPlanEJBDAO.selectScenarioPlanList(param);
    }
    public HashMap selectScenarioPlanDetail(DefaultParameters param) throws DefaultEJBException {
        return scenarioPlanEJBDAO.selectScenarioPlanDetail(param);
    }
    public HashMap updateScenarioPlan(DefaultParameters param) throws DefaultEJBException {
        return scenarioPlanEJBDAO.updateScenarioPlan(param);
    }
    public HashMap deleteScenarioPlan(DefaultParameters param) throws DefaultEJBException {
        return scenarioPlanEJBDAO.deleteScenarioPlan(param);
    }
}