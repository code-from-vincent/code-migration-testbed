package com.switchover.legacy.ejb.csr;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface InnovationIdea extends EJBObject {
    HashMap insertInnovationIdea(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectInnovationIdeaList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectInnovationIdeaDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateInnovationIdea(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteInnovationIdea(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
