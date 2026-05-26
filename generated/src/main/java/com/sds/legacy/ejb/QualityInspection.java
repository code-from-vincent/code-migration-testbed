package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface QualityInspection extends DefaultSession {
    HashMap insertQualityInspection(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectQualityInspectionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectQualityInspectionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateQualityInspection(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteQualityInspection(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
