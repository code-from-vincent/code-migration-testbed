package com.switchover.legacy.ejb.hr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface MentoringProgram extends EJBObject {
    HashMap insertMentoringProgram(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMentoringProgramList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMentoringProgramDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMentoringProgram(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMentoringProgram(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
