package kr.some.cmm.frame;

import java.rmi.RemoteException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/**
 * Base class for NTIS EJB Session Beans.
 */
public abstract class DefaultSession implements SessionBean {
    private SessionContext sessionContext;

    @Override
    public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException {
        this.sessionContext = sessionContext;
    }

    protected SessionContext getSessionContext() {
        return sessionContext;
    }

    @Override
    public void ejbActivate() throws EJBException, RemoteException {
    }

    @Override
    public void ejbPassivate() throws EJBException, RemoteException {
    }

    @Override
    public void ejbRemove() throws EJBException, RemoteException {
    }
}