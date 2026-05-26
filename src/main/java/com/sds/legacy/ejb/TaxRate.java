package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface TaxRate extends DefaultSession {
    HashMap insertTaxRate(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTaxRateList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTaxRateDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTaxRate(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTaxRate(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
