package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface Benchmark extends DefaultSession {
    HashMap insertBenchmark(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectBenchmarkList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectBenchmarkDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateBenchmark(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteBenchmark(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
