package com.switchover.legacy.ejb.sales;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PartnerSettlement extends EJBObject {
    HashMap insertPartnerSettlement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPartnerSettlementList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPartnerSettlementDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePartnerSettlement(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePartnerSettlement(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
