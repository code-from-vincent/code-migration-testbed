package com.switchover.legacy.ejb.report;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface DataImportJob extends EJBObject {
    HashMap insertDataImportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDataImportJobList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDataImportJobDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDataImportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDataImportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
