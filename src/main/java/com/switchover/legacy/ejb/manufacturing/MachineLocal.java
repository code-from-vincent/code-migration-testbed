package com.switchover.legacy.ejb.manufacturing;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface MachineLocal extends EJBLocalObject {
    HashMap insertMachine(DefaultParameters param) throws DefaultEJBException;
    Collection selectMachineList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectMachineDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateMachine(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteMachine(DefaultParameters param) throws DefaultEJBException;
}