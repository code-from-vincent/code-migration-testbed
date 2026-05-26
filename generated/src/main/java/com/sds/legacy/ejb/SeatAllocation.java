package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface SeatAllocation extends DefaultSession {
    HashMap insertSeatAllocation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSeatAllocationList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSeatAllocationDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSeatAllocation(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSeatAllocation(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
