package com.switchover.legacy.ejb.logistics;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface DeliveryAssignment extends EJBObject {
    HashMap insertDeliveryAssignment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDeliveryAssignmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDeliveryAssignmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDeliveryAssignment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDeliveryAssignment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
