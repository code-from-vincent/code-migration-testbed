package com.switchover.legacy.ejb.document;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface DocumentApproval extends EJBObject {
    HashMap insertDocumentApproval(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDocumentApprovalList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDocumentApprovalDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDocumentApproval(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDocumentApproval(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
