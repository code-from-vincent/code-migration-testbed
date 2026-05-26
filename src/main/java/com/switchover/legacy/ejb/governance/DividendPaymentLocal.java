package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface DividendPaymentLocal extends EJBLocalObject {
    HashMap insertDividendPayment(DefaultParameters param) throws DefaultEJBException;
    Collection selectDividendPaymentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectDividendPaymentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateDividendPayment(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteDividendPayment(DefaultParameters param) throws DefaultEJBException;
}