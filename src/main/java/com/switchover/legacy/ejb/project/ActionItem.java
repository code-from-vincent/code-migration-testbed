package com.switchover.legacy.ejb.project;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;
public interface ActionItem extends EJBObject {
    HashMap insertActionItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectActionItemList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectActionItemDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateActionItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteActionItem(DefaultParameters param) throws RemoteException, DefaultEJBException;
}