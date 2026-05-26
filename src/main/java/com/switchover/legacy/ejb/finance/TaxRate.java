package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface TaxRate extends EJBObject {
    HashMap insertTaxRate(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectTaxRateList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectTaxRateDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateTaxRate(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteTaxRate(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
