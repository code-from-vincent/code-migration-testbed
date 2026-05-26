package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface SupplierScorecard extends DefaultSession {
    HashMap insertSupplierScorecard(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSupplierScorecardList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSupplierScorecardDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSupplierScorecard(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSupplierScorecard(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
