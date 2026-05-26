package com.switchover.legacy.ejb.finance;
import java.util.Collection;
import java.util.HashMap;
import javax.ejb.EJBLocalObject;
import kr.some.cmm.frame.DefaultEJBException;
import kr.some.cmm.util.DefaultParameters;
public interface ExchangeRateLocal extends EJBLocalObject {
    HashMap insertExchangeRate(DefaultParameters param) throws DefaultEJBException;
    Collection selectExchangeRateList(DefaultParameters param) throws DefaultEJBException;
    HashMap selectExchangeRateDetail(DefaultParameters param) throws DefaultEJBException;
    HashMap updateExchangeRate(DefaultParameters param) throws DefaultEJBException;
    HashMap deleteExchangeRate(DefaultParameters param) throws DefaultEJBException;
}