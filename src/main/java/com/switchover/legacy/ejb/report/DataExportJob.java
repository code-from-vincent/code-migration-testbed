package com.switchover.legacy.ejb.report;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface DataExportJob extends EJBObject {
    HashMap insertDataExportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDataExportJobList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDataExportJobDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDataExportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDataExportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
