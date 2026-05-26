package com.switchover.legacy.ejb.governance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Benchmark extends EJBObject {
    HashMap insertBenchmark(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBenchmarkList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBenchmarkDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBenchmark(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBenchmark(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
