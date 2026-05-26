package com.switchover.legacy.ejb.facility;
import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;
public interface BranchOffice extends EJBObject {
    HashMap insertBranchOffice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBranchOfficeList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBranchOfficeDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBranchOffice(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBranchOffice(DefaultParameters param) throws RemoteException, DefaultEJBException;
}