package com.switchover.legacy.ejb.facility;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;
public interface Facility extends EJBObject {
    HashMap insertFacility(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFacilityList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFacilityDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFacility(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFacility(DefaultParameters param) throws RemoteException, DefaultEJBException;
}