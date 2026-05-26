package com.switchover.legacy.ejb.hr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface MentoringProgramHome extends EJBHome {
    MentoringProgram create() throws CreateException, RemoteException;
}