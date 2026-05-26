package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;
public interface ReleasePlan extends EJBObject {
    HashMap insertReleasePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectReleasePlanList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectReleasePlanDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateReleasePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteReleasePlan(DefaultParameters param) throws RemoteException, DefaultEJBException;
}