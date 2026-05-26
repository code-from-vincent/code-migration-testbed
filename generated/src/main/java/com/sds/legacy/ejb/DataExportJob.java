package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface DataExportJob extends DefaultSession {
    HashMap insertDataExportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectDataExportJobList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectDataExportJobDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateDataExportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteDataExportJob(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
