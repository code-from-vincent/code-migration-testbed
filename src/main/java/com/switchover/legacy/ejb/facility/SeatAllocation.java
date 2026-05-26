package com.switchover.legacy.ejb.facility;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SeatAllocation extends EJBObject {
    HashMap insertSeatAllocation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSeatAllocationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSeatAllocationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSeatAllocation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSeatAllocation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
