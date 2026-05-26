package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface YearEndClosing extends EJBObject {
    HashMap insertYearEndClosing(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectYearEndClosingList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectYearEndClosingDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateYearEndClosing(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteYearEndClosing(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
