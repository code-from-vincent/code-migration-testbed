package com.switchover.legacy.ejb.document;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface Faq extends EJBObject {
    HashMap insertFaq(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectFaqList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectFaqDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateFaq(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteFaq(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
