package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.frame.DefaultSession;
import kr.some.cmm.util.DefaultParameters;
public class ExchangeRateBean extends DefaultSession {
    private final ExchangeRateEJBDAO exchangeRateEJBDAO = new ExchangeRateEJBDAO();
    public HashMap insertExchangeRate(DefaultParameters param) throws DefaultEJBException {
        return exchangeRateEJBDAO.insertExchangeRate(param);
    }
    public Collection selectExchangeRateList(DefaultParameters param) throws DefaultEJBException {
        return exchangeRateEJBDAO.selectExchangeRateList(param);
    }
    public HashMap selectExchangeRateDetail(DefaultParameters param) throws DefaultEJBException {
        return exchangeRateEJBDAO.selectExchangeRateDetail(param);
    }
    public HashMap updateExchangeRate(DefaultParameters param) throws DefaultEJBException {
        return exchangeRateEJBDAO.updateExchangeRate(param);
    }
    public HashMap deleteExchangeRate(DefaultParameters param) throws DefaultEJBException {
        return exchangeRateEJBDAO.deleteExchangeRate(param);
    }
}