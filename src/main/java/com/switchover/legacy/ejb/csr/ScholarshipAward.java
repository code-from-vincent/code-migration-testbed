package com.switchover.legacy.ejb.csr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ScholarshipAward extends EJBObject {
    HashMap insertScholarshipAward(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectScholarshipAwardList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectScholarshipAwardDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateScholarshipAward(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteScholarshipAward(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
