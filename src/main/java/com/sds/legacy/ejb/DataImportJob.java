package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface DataImportJob extends DefaultSession {
    HashMap insertDataImportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDataImportJobList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDataImportJobDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDataImportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDataImportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
