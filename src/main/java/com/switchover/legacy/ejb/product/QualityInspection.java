package com.switchover.legacy.ejb.product;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface QualityInspection extends EJBObject {
    HashMap insertQualityInspection(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectQualityInspectionList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectQualityInspectionDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateQualityInspection(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteQualityInspection(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
