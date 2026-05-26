package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Partner extends DefaultSession {
    HashMap insertPartner(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPartnerList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPartnerDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePartner(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePartner(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
