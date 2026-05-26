package com.switchover.legacy.ejb.finance;

import java.rmi.RemoteException;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import javax.ejb.EJBObject;
import kr.some.cmm.util.DefaultParameters;

public interface JournalEntry extends EJBObject {
    HashMap insertJournalEntry(DefaultParameters param) throws RemoteException, DefaultEJBException;
    Collection selectJournalEntryList(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap selectJournalEntryDetail(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap updateJournalEntry(DefaultParameters param) throws RemoteException, DefaultEJBException;
    HashMap deleteJournalEntry(DefaultParameters param) throws RemoteException, DefaultEJBException;
}
