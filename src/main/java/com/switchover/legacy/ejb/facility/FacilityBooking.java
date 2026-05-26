package com.switchover.legacy.ejb.facility;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface FacilityBooking extends EJBObject {
    HashMap insertFacilityBooking(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFacilityBookingList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFacilityBookingDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFacilityBooking(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFacilityBooking(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
