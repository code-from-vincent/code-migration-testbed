package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface MachineDowntimeLocal extends EJBLocalObject {
    HashMap insertMachineDowntime(DefaultParameters param) throws DefaultEJBException;
    Collection selectMachineDowntimeList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectMachineDowntimeDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateMachineDowntime(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteMachineDowntime(DefaultParameters param) throws DefaultEJBException;
}