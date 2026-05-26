package com.switchover.legacy.ejb.sales;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Partner extends EJBObject {
    HashMap insertPartner(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPartnerList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPartnerDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePartner(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePartner(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
