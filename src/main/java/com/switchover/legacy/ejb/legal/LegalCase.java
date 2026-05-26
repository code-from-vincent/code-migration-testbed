package com.switchover.legacy.ejb.legal;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface LegalCase extends EJBObject {
    HashMap insertLegalCase(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectLegalCaseList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectLegalCaseDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateLegalCase(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteLegalCase(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
