package com.switchover.legacy.ejb.facility;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface SeatAllocationLocal extends EJBLocalObject {
    HashMap insertSeatAllocation(DefaultParameters param) throws DefaultEJBException;
    Collection selectSeatAllocationList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectSeatAllocationDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateSeatAllocation(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteSeatAllocation(DefaultParameters param) throws DefaultEJBException;
}