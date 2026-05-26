package com.switchover.legacy.ejb.sales;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Opportunity extends EJBObject {
    HashMap insertOpportunity(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectOpportunityList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectOpportunityDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateOpportunity(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteOpportunity(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
