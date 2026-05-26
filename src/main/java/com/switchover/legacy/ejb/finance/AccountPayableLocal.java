package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface AccountPayableLocal extends EJBLocalObject {
    HashMap insertAccountPayable(DefaultParameters param) throws DefaultEJBException;
    Collection selectAccountPayableList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectAccountPayableDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateAccountPayable(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteAccountPayable(DefaultParameters param) throws DefaultEJBException;
}