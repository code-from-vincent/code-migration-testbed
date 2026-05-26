package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PricePolicy extends DefaultSession {
    HashMap insertPricePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPricePolicyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPricePolicyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePricePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePricePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
