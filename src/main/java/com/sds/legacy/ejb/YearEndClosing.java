package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface YearEndClosing extends DefaultSession {
    HashMap insertYearEndClosing(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectYearEndClosingList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectYearEndClosingDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateYearEndClosing(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteYearEndClosing(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
