package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface BankAccountLocal extends EJBLocalObject {
    HashMap insertBankAccount(DefaultParameters param) throws DefaultEJBException;
    Collection selectBankAccountList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectBankAccountDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateBankAccount(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteBankAccount(DefaultParameters param) throws DefaultEJBException;
}