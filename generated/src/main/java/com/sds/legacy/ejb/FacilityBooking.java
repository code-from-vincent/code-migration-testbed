package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface FacilityBooking extends DefaultSession {
    HashMap insertFacilityBooking(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFacilityBookingList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFacilityBookingDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFacilityBooking(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFacilityBooking(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
