package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class StrategicInitiativeBean extends DefaultSession {
    private final StrategicInitiativeEJBDAO strategicInitiativeEJBDAO = new StrategicInitiativeEJBDAO();
    public HashMap insertStrategicInitiative(DefaultParameters param) throws DefaultEJBException {
        return strategicInitiativeEJBDAO.insertStrategicInitiative(param);
    }
    public Collection selectStrategicInitiativeList(DefaultParameters param) throws DefaultEJBException {
        return strategicInitiativeEJBDAO.selectStrategicInitiativeList(param);
    }
    public HashMap selectStrategicInitiativeDetail(DefaultParameters param) throws DefaultEJBException {
        return strategicInitiativeEJBDAO.selectStrategicInitiativeDetail(param);
    }
    public HashMap updateStrategicInitiative(DefaultParameters param) throws DefaultEJBException {
        return strategicInitiativeEJBDAO.updateStrategicInitiative(param);
    }
    public HashMap deleteStrategicInitiative(DefaultParameters param) throws DefaultEJBException {
        return strategicInitiativeEJBDAO.deleteStrategicInitiative(param);
    }
}