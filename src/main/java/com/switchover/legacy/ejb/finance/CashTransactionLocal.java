package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface CashTransactionLocal extends EJBLocalObject {
    HashMap insertCashTransaction(DefaultParameters param) throws DefaultEJBException;
    Collection selectCashTransactionList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectCashTransactionDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateCashTransaction(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteCashTransaction(DefaultParameters param) throws DefaultEJBException;
}