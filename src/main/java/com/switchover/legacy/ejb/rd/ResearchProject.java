package com.switchover.legacy.ejb.rd;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface ResearchProject extends EJBObject {
    HashMap insertResearchProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectResearchProjectList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectResearchProjectDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateResearchProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteResearchProject(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
