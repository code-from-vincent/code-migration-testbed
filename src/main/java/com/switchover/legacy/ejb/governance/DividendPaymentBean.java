package com.switchover.legacy.ejb.governance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class DividendPaymentBean extends DefaultSession {
    private final DividendPaymentEJBDAO dividendPaymentEJBDAO = new DividendPaymentEJBDAO();
    public HashMap insertDividendPayment(DefaultParameters param) throws DefaultEJBException {
        return dividendPaymentEJBDAO.insertDividendPayment(param);
    }
    public Collection selectDividendPaymentList(DefaultParameters param) throws DefaultEJBException {
        return dividendPaymentEJBDAO.selectDividendPaymentList(param);
    }
    public HashMap selectDividendPaymentDetail(DefaultParameters param) throws DefaultEJBException {
        return dividendPaymentEJBDAO.selectDividendPaymentDetail(param);
    }
    public HashMap updateDividendPayment(DefaultParameters param) throws DefaultEJBException {
        return dividendPaymentEJBDAO.updateDividendPayment(param);
    }
    public HashMap deleteDividendPayment(DefaultParameters param) throws DefaultEJBException {
        return dividendPaymentEJBDAO.deleteDividendPayment(param);
    }
}