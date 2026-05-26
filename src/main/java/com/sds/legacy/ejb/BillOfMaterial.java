package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface BillOfMaterial extends DefaultSession {
    HashMap insertBillOfMaterial(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBillOfMaterialList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBillOfMaterialDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBillOfMaterial(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBillOfMaterial(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
