package com.switchover.legacy.ejb.workflow;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ApprovalLine extends EJBObject {
    HashMap insertApprovalLine(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectApprovalLineList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectApprovalLineDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateApprovalLine(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteApprovalLine(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
