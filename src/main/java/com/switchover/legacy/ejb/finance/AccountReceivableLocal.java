package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface AccountReceivableLocal extends EJBLocalObject {
    HashMap insertAccountReceivable(DefaultParameters param) throws DefaultEJBException;
    Collection selectAccountReceivableList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectAccountReceivableDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateAccountReceivable(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteAccountReceivable(DefaultParameters param) throws DefaultEJBException;
}