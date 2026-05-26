package com.switchover.legacy.ejb.esg;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface EnergyUsageLocal extends EJBLocalObject {
    HashMap insertEnergyUsage(DefaultParameters param) throws DefaultEJBException;
    Collection selectEnergyUsageList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectEnergyUsageDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateEnergyUsage(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteEnergyUsage(DefaultParameters param) throws DefaultEJBException;
}