package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface MergerAcquisition extends DefaultSession {
    HashMap insertMergerAcquisition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMergerAcquisitionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMergerAcquisitionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMergerAcquisition(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMergerAcquisition(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
