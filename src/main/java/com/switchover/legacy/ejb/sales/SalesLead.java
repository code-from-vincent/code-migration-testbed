package com.switchover.legacy.ejb.sales;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface SalesLead extends EJBObject {
    HashMap insertSalesLead(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectSalesLeadList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectSalesLeadDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateSalesLead(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteSalesLead(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
