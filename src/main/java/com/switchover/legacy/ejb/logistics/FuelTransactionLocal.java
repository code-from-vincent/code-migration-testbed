package com.switchover.legacy.ejb.logistics;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface FuelTransactionLocal extends EJBLocalObject {
    HashMap insertFuelTransaction(DefaultParameters param) throws DefaultEJBException;
    Collection selectFuelTransactionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectFuelTransactionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateFuelTransaction(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteFuelTransaction(DefaultParameters param) throws DefaultEJBException;
}