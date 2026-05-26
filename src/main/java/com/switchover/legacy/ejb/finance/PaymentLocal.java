package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface PaymentLocal extends EJBLocalObject {
    HashMap insertPayment(DefaultParameters param) throws DefaultEJBException;
    Collection selectPaymentList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectPaymentDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updatePayment(DefaultParameters param) throws DefaultEJBException;
    HashMap deletePayment(DefaultParameters param) throws DefaultEJBException;
}