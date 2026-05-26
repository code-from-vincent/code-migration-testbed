package com.switchover.legacy.ejb.esg;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class EnergyUsageBean extends DefaultSession {
    private final EnergyUsageEJBDAO energyUsageEJBDAO = new EnergyUsageEJBDAO();
    public HashMap insertEnergyUsage(DefaultParameters param) throws DefaultEJBException {
        return energyUsageEJBDAO.insertEnergyUsage(param);
    }
    public Collection selectEnergyUsageList(DefaultParameters param) throws DefaultEJBException {
        return energyUsageEJBDAO.selectEnergyUsageList(param);
    }
    public HashMap selectEnergyUsageDetail(DefaultParameters param) throws DefaultEJBException {
        return energyUsageEJBDAO.selectEnergyUsageDetail(param);
    }
    public HashMap updateEnergyUsage(DefaultParameters param) throws DefaultEJBException {
        return energyUsageEJBDAO.updateEnergyUsage(param);
    }
    public HashMap deleteEnergyUsage(DefaultParameters param) throws DefaultEJBException {
        return energyUsageEJBDAO.deleteEnergyUsage(param);
    }
}