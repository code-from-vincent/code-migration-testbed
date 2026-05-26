package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface SalesLead extends DefaultSession {
    HashMap insertSalesLead(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSalesLeadList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSalesLeadDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSalesLead(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSalesLead(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
