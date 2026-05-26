package com.switchover.legacy.ejb.manufacturing;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface BillOfMaterial extends EJBObject {
    HashMap insertBillOfMaterial(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBillOfMaterialList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBillOfMaterialDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBillOfMaterial(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBillOfMaterial(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
