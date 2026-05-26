package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface ProfitCenter extends DefaultSession {
    HashMap insertProfitCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProfitCenterList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProfitCenterDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProfitCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProfitCenter(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
