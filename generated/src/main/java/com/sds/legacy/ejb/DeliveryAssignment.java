package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface DeliveryAssignment extends DefaultSession {
    HashMap insertDeliveryAssignment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDeliveryAssignmentList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDeliveryAssignmentDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDeliveryAssignment(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDeliveryAssignment(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
