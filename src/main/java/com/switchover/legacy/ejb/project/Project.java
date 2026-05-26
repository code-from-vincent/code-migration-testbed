package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;
public interface Project extends EJBObject {
    HashMap insertProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectProjectList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectProjectDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
}