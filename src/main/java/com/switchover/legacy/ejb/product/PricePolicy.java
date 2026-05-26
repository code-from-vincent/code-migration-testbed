package com.switchover.legacy.ejb.product;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface PricePolicy extends EJBObject {
    HashMap insertPricePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectPricePolicyList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectPricePolicyDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updatePricePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deletePricePolicy(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
