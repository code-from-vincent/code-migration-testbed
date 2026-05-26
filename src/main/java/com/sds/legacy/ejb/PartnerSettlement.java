package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface PartnerSettlement extends DefaultSession {
    HashMap insertPartnerSettlement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPartnerSettlementList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPartnerSettlementDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePartnerSettlement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePartnerSettlement(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
