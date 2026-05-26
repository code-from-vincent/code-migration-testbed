package com.switchover.legacy.ejb.governance;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface BenchmarkHome extends EJBHome {
    Benchmark create() throws CreateException, RemoteException;
}