package com.switchover.legacy.ejb.hr;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RecruitmentPostingHome extends EJBHome {
    RecruitmentPosting create() throws CreateException, RemoteException;
}