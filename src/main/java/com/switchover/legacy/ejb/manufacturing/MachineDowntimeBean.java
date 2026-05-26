package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class MachineDowntimeBean extends DefaultSession {
    private final MachineDowntimeEJBDAO machineDowntimeEJBDAO = new MachineDowntimeEJBDAO();
    public HashMap insertMachineDowntime(DefaultParameters param) throws DefaultEJBException {
        return machineDowntimeEJBDAO.insertMachineDowntime(param);
    }
    public Collection selectMachineDowntimeList(DefaultParameters param) throws DefaultEJBException {
        return machineDowntimeEJBDAO.selectMachineDowntimeList(param);
    }
    public HashMap selectMachineDowntimeDetail(DefaultParameters param) throws DefaultEJBException {
        return machineDowntimeEJBDAO.selectMachineDowntimeDetail(param);
    }
    public HashMap updateMachineDowntime(DefaultParameters param) throws DefaultEJBException {
        return machineDowntimeEJBDAO.updateMachineDowntime(param);
    }
    public HashMap deleteMachineDowntime(DefaultParameters param) throws DefaultEJBException {
        return machineDowntimeEJBDAO.deleteMachineDowntime(param);
    }
}