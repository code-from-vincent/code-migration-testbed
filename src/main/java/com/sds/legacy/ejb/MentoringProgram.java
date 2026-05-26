package com.sds.legacy.ejb;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import gov.mogaha.ntis.cmm.frame.DefaultEJBException;
import gov.mogaha.ntis.cmm.frame.DefaultSession;
import gov.mogaha.ntis.cmm.util.DefaultParameters;

public interface MentoringProgram extends DefaultSession {
    HashMap insertMentoringProgram(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectMentoringProgramList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectMentoringProgramDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateMentoringProgram(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteMentoringProgram(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
