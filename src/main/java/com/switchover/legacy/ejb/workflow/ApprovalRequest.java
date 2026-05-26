package com.switchover.legacy.ejb.workflow;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ApprovalRequest extends EJBObject {
    HashMap insertApprovalRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectApprovalRequestList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectApprovalRequestDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateApprovalRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteApprovalRequest(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
