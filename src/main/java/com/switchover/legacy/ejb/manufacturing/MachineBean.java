package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class MachineBean extends DefaultSession {
    private final MachineEJBDAO machineEJBDAO = new MachineEJBDAO();
    public HashMap insertMachine(DefaultParameters param) throws DefaultEJBException {
        return machineEJBDAO.insertMachine(param);
    }
    public Collection selectMachineList(DefaultParameters param) throws DefaultEJBException {
        return machineEJBDAO.selectMachineList(param);
    }
    public HashMap selectMachineDetail(DefaultParameters param) throws DefaultEJBException {
        return machineEJBDAO.selectMachineDetail(param);
    }
    public HashMap updateMachine(DefaultParameters param) throws DefaultEJBException {
        return machineEJBDAO.updateMachine(param);
    }
    public HashMap deleteMachine(DefaultParameters param) throws DefaultEJBException {
        return machineEJBDAO.deleteMachine(param);
    }
}