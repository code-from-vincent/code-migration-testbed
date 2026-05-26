package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class PaymentBean extends DefaultSession {
    private final PaymentEJBDAO paymentEJBDAO = new PaymentEJBDAO();
    public HashMap insertPayment(DefaultParameters param) throws DefaultEJBException {
        return paymentEJBDAO.insertPayment(param);
    }
    public Collection selectPaymentList(DefaultParameters param) throws DefaultEJBException {
        return paymentEJBDAO.selectPaymentList(param);
    }
    public HashMap selectPaymentDetail(DefaultParameters param) throws DefaultEJBException {
        return paymentEJBDAO.selectPaymentDetail(param);
    }
    public HashMap updatePayment(DefaultParameters param) throws DefaultEJBException {
        return paymentEJBDAO.updatePayment(param);
    }
    public HashMap deletePayment(DefaultParameters param) throws DefaultEJBException {
        return paymentEJBDAO.deletePayment(param);
    }
}