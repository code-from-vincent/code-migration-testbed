package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;
public interface DeploymentHistory extends EJBObject {
    HashMap insertDeploymentHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDeploymentHistoryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDeploymentHistoryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDeploymentHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDeploymentHistory(DefaultParameters param) throws RemoteException, DefaultEJBException;
}